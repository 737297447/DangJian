package com.lingdian.dangjian.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;

import com.gyf.barlibrary.ImmersionBar;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseActivity;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.ui.adapter.MyAdapter;
import com.lingdian.dangjian.ui.fragment.HuiyinbiFragment;
import com.lingdian.dangjian.ui.fragment.WentiQiangFragment;
import com.lingdian.dangjian.view.xtablayout.XTabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2017/6/24.
 */

public class WentiQiangActivity extends BaseActivity {


    @BindView(R.id.left_image)
    ImageView leftImage;
    @BindView(R.id.center_text)
    TextView centerText;
    @BindView(R.id.tablatyou_attention1)
    XTabLayout mTabLayout;
    @BindView(R.id.container)
    ViewPager viewPager;


    private List<String> mTitle = new ArrayList<>();
    private List<Fragment> mFragment = new ArrayList<>();

    private int type;

    @Override
    public int getLayoutId() {
        return R.layout.activity_wentiqiang;
    }

    @Override
    public void configViews() {
        ImmersionBar.with(this)
                .statusBarDarkFont(false)
                .statusBarColor(R.color.colorPrimary)
                .fitsSystemWindows(true)
                .init();

        type = getIntent().getIntExtra("type",1);



    }

    @Override
    public void initDatas() {

        mTitle.add("群众提");
        mTitle.add("自己找");
        mTitle.add("上级点");
        mTitle.add("集体议");

        if (type == 1){
            centerText.setText("问题墙");
            mFragment.add(WentiQiangFragment.newInstance("CA"));
            mFragment.add(WentiQiangFragment.newInstance("FY"));
            mFragment.add(WentiQiangFragment.newInstance("SP"));
            mFragment.add(WentiQiangFragment.newInstance("CD"));

        }else{
            centerText.setText("回音壁");
            mFragment.add(HuiyinbiFragment.newInstance("CA"));
            mFragment.add(HuiyinbiFragment.newInstance("FY"));
            mFragment.add(HuiyinbiFragment.newInstance("SP"));
            mFragment.add(HuiyinbiFragment.newInstance("CD"));

        }





        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), mTitle, mFragment);
        viewPager.setAdapter(adapter);
        mTabLayout.setxTabDisplayNum(4);//需要写在setupWithViewPager前
        //为TabLayout设置ViewPager
        mTabLayout.setupWithViewPager(viewPager);
        //使用ViewPager的适配器
        mTabLayout.setTabsFromPagerAdapter(adapter);

    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {

    }

    @Override
    public void attachView() {

    }


    @OnClick(R.id.left_image)
    public void onViewClicked() {
        finish();
    }


    /**
     *
     * @param context
     * @param type 1.问题墙 2.回音壁
     */
    public static void startActivity(Context context,int type) {
        Intent i = new Intent(context, WentiQiangActivity.class);
        i.putExtra("type",type);
        context.startActivity(i);
    }

}
