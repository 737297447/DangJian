package com.lingdian.dangjian.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.gyf.barlibrary.ImmersionBar;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseActivity;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.ui.adapter.FragmentViewPagerAdapter;
import com.lingdian.dangjian.ui.bean.support.ReturnMain2;
import com.lingdian.dangjian.ui.fragment.Main1Fragment;
import com.lingdian.dangjian.ui.fragment.Main2Fragment;
import com.lingdian.dangjian.ui.fragment.Main3Fragment;
import com.lingdian.dangjian.ui.fragment.Main4Fragment;
import com.lingdian.dangjian.ui.fragment.Main5Fragment;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.viewpager)
    ViewPager viewpager;

    @BindView(R.id.ly_botton)
    LinearLayout ly_botton;
    @BindView(R.id.re_1)
    RelativeLayout re1;
    @BindView(R.id.re_2)
    RelativeLayout re2;
    @BindView(R.id.re_3)
    RelativeLayout re3;
    @BindView(R.id.re_4)
    RelativeLayout re4;
    @BindView(R.id.re_5)
    RelativeLayout re5;



    private List<Fragment> fragmentList = new ArrayList<>();
    //当前选中的分类标题
    private int currIndex = 0;//当前页卡编号


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void configViews() {
        EventBus.getDefault().register(this);
        ImmersionBar.with(this)
                .statusBarDarkFont(false)
                .navigationBarColor(R.color.colorPrimary)
                .init();
    }

    @Override
    public void initDatas() {
        fragmentList.add(Main1Fragment.newInstance());
        fragmentList.add(Main2Fragment.newInstance());
        fragmentList.add(Main3Fragment.newInstance());
        fragmentList.add(Main4Fragment.newInstance());
        fragmentList.add(Main5Fragment.newInstance());

        FragmentViewPagerAdapter adapter = new FragmentViewPagerAdapter(this.getSupportFragmentManager(), viewpager, fragmentList);
        adapter.setOnExtraPageChangeListener(new FragmentViewPagerAdapter.OnExtraPageChangeListener() {
            @Override
            public void onExtraPageSelected(int i) {
                System.out.println("Extra...i: " + i);
            }
        });

        viewpager.setOnPageChangeListener(new MyOnPageChangeListener());//页面变化时的监听器
        setSelected(0);
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    public void attachView() {

    }

    /**
     * 点击给我推荐，把条件带过去在第二个页面筛选
     * @param event
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void returnMenu2(ReturnMain2 event){
        viewpager.setCurrentItem(1);
    }



    @OnClick({R.id.re_1, R.id.re_2, R.id.re_3, R.id.re_4, R.id.re_5})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.re_1:
                viewpager.setCurrentItem(0);
                break;
            case R.id.re_2:
                viewpager.setCurrentItem(1);
                break;
            case R.id.re_3:
                viewpager.setCurrentItem(2);
                break;
            case R.id.re_4:
                viewpager.setCurrentItem(3);
                break;
            case R.id.re_5:
                viewpager.setCurrentItem(4);
                break;
        }
    }

    public class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onPageScrollStateChanged(int arg0) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onPageSelected(int arg0) {
            // TODO Auto-generated method stub
            currIndex = arg0;
            switch (currIndex) {
                case 0:
                    setSelected(0);
                    break;
                case 1:
                    setSelected(1);
                    break;
                case 2:
                    setSelected(2);
                    break;
                case 3:
                    setSelected(3);
                    break;
                case 4:
                    setSelected(4);
                    break;
            }

        }
    }

    private void setSelected(int index){
        switch (index){
            case 0:
                ImmersionBar.with(this).fitsSystemWindows(true).statusBarColor(R.color.c_D42D1D).init();
                re1.setSelected(true);
                re2.setSelected(false);
                re3.setSelected(false);
                re4.setSelected(false);
                re5.setSelected(false);
                break;
            case 1:
                ImmersionBar.with(this).fitsSystemWindows(true).statusBarColor(R.color.colorPrimary).init();
                re1.setSelected(false);
                re2.setSelected(true);
                re3.setSelected(false);
                re4.setSelected(false);
                re5.setSelected(false);
                break;
            case 2:
                ImmersionBar.with(this).fitsSystemWindows(true).statusBarColor(R.color.colorPrimary).init();
                re1.setSelected(false);
                re2.setSelected(false);
                re3.setSelected(true);
                re4.setSelected(false);
                re5.setSelected(false);
                break;
            case 3:
                ImmersionBar.with(this).fitsSystemWindows(true).statusBarColor(R.color.colorPrimary).init();
                re1.setSelected(false);
                re2.setSelected(false);
                re3.setSelected(false);
                re4.setSelected(true);
                re5.setSelected(false);
                break;
            case 4:
                ImmersionBar.with(this).fitsSystemWindows(true).statusBarColor(R.color.colorPrimary).init();
                re1.setSelected(false);
                re2.setSelected(false);
                re3.setSelected(false);
                re4.setSelected(false);
                re5.setSelected(true);
                break;
        }


    }


    public static void startActivity(Context context) {
        Intent i = new Intent(context, MainActivity.class);
        context.startActivity(i);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
