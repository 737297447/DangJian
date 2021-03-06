package com.lingdian.dangjian.base;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.lingdian.dangjian.App;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.ui.dialog.ExitDialog;
import com.lingdian.dangjian.ui.dialog.JuhuaDialog;
import com.gyf.barlibrary.ImmersionBar;
import com.trello.rxlifecycle.LifecycleProvider;
import com.trello.rxlifecycle.LifecycleTransformer;
import com.trello.rxlifecycle.RxLifecycle;
import com.trello.rxlifecycle.android.ActivityEvent;
import com.trello.rxlifecycle.android.RxLifecycleAndroid;

import butterknife.ButterKnife;
import rx.Observable;
import rx.subjects.BehaviorSubject;

/**
 * Created by Administrator on 2016/11/15.
 */

public abstract class BaseActivity extends AppCompatActivity implements LifecycleProvider<ActivityEvent> {


    protected JuhuaDialog juhuaDialog;

    protected ExitDialog exitDialog;


    @Override
    @CallSuper
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        ImmersionBar.with(this).init();
        if (savedInstanceState != null) {
            FragmentManager manager = getSupportFragmentManager();
            manager.popBackStackImmediate(null, 1);
        }

        ButterKnife.bind(this);
        lifecycleSubject.onNext(ActivityEvent.CREATE);
        setupActivityComponent(App.getInstance().getAppComponent());
        attachView();
        configViews();
        initDatas();

        exitDialog = new ExitDialog(this, "您的账号在异地登陆，请重新登陆", "登陆");
    }


    public abstract void attachView();

    public abstract int getLayoutId();

    /**
     * 对各种控件进行设置、适配、填充数据
     */
    public abstract void configViews();

    public abstract void initDatas();


    protected abstract void setupActivityComponent(AppComponent appComponent);


    /**
     * 显示dialog
     *
     * @param dialogText 可为空，为空不显示文字
     */
    protected void showDialog(String dialogText) {
        // TODO Auto-generated method stub
        juhuaDialog = new JuhuaDialog(this, dialogText);
        juhuaDialog.show();
//        mGifLoadingView = GifLoadingView.newInstance(dialogText);
//        mGifLoadingView.show(getFragmentManager(), "");
    }

    /**
     * 隐藏dialog
     */
    protected void dismissDialog() {
        // TODO Auto-generated method stub
//        if (mGifLoadingView != null)
//            mGifLoadingView.dismiss();

        if (juhuaDialog != null)
            juhuaDialog.dismiss();
    }


    protected void showUserDialog() {
        // TODO Auto-generated method stub
        if (exitDialog != null)
            if (!exitDialog.isShowing())
                exitDialog.show();

    }


    //解决崩溃后重新打开程序，fragment 重叠问题
    //当前APP崩溃再次启动或者从后台再次回到这个app的时候，通过onCreate中的参数savedInstanceState恢复了之前的fragment。
    // 此时的FragmentTransaction中的相当于又再次add了fragment进去的，之前保存的fragment也还在。hide()和show()方法对
    // 之前保存的fragment已经失效了。所以出现了重叠的现象
    @Override
    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
    }


    private final BehaviorSubject<ActivityEvent> lifecycleSubject = BehaviorSubject.create();

    @Override
    @NonNull
    @CheckResult
    public final Observable<ActivityEvent> lifecycle() {
        return lifecycleSubject.asObservable();
    }

    @Override
    @NonNull
    @CheckResult
    public final <T> LifecycleTransformer<T> bindUntilEvent(@NonNull ActivityEvent event) {
        return RxLifecycle.bindUntilEvent(lifecycleSubject, event);
    }

    @Override
    @NonNull
    @CheckResult
    public final <T> LifecycleTransformer<T> bindToLifecycle() {
        return RxLifecycleAndroid.bindActivity(lifecycleSubject);
    }

    @Override
    @CallSuper
    protected void onStart() {
        super.onStart();
        lifecycleSubject.onNext(ActivityEvent.START);
    }

    @Override
    @CallSuper
    protected void onResume() {
        super.onResume();
        lifecycleSubject.onNext(ActivityEvent.RESUME);
    }

    @Override
    @CallSuper
    protected void onPause() {
        super.onPause();
        lifecycleSubject.onNext(ActivityEvent.PAUSE);
    }

    @Override
    @CallSuper
    protected void onStop() {
        lifecycleSubject.onNext(ActivityEvent.STOP);
        super.onStop();
    }

    @Override
    @CallSuper
    protected void onDestroy() {
        super.onDestroy();
        lifecycleSubject.onNext(ActivityEvent.DESTROY);
        //不调用该方法，如果界面bar发生改变，在不关闭app的情况下，退出此界面再进入将记忆最后一次bar改变的状态
        ImmersionBar.with(this).destroy();
    }
}
