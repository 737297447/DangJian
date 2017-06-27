package com.lingdian.dangjian.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseRVFragment;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerMainComponent;
import com.lingdian.dangjian.ui.activity.SanhuiActivity;
import com.lingdian.dangjian.ui.bean.BannerData;
import com.lingdian.dangjian.ui.contract.Main1Contract;
import com.lingdian.dangjian.ui.presenter.Main1Presenter;
import com.lingdian.dangjian.util.CommonUtils;
import com.lingdian.dangjian.view.cycleviewpager.CycleViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.lingdian.dangjian.R.id.ly_banner;


/**
 * Created by Administrator on 2017/1/22.
 * 办事中心页面
 */

public class Main3Fragment extends BaseRVFragment<Main1Presenter> implements Main1Contract.View {


    @BindView(R.id.left_image)
    ImageView leftImage;
    @BindView(R.id.center_text)
    TextView centerText;
    @BindView(ly_banner)
    LinearLayout lyBanner;


    private CycleViewPager cycleViewPager;
    private List<View> views = new ArrayList<>();
    private List<BannerData> infos = new ArrayList<>();


    public static Main3Fragment newInstance() {
        Main3Fragment f = new Main3Fragment();
        Bundle b = new Bundle();
        b.putString("type", "Main2Fragment");
        f.setArguments(b);
        return f;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_main3;
    }

    @Override
    protected void immersionInit() {

    }

    @Override
    public void configViews() {

        leftImage.setVisibility(View.INVISIBLE);
        centerText.setText("党内活动");
        cycleViewPager = (CycleViewPager) getActivity().getFragmentManager()
                .findFragmentById(R.id.fm_banner);

        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) lyBanner.getLayoutParams();
        params.width = CommonUtils.getScreenMaxWidth(getActivity(), 0);
        int bannerHeight = (params.width * 530) / 975;
        params.height = bannerHeight;

        lyBanner.setLayoutParams(params);

    }

    @Override
    public void initDatas() {
        List<BannerData> list = new ArrayList<>();
        BannerData data1 = new BannerData();
        data1.setImgRes(R.mipmap.b1);
        data1.setTitle("习近平主持召开深度贫困地区脱贫攻坚座谈会");
        BannerData data2 = new BannerData();
        data2.setImgRes(R.mipmap.b2);
        data2.setTitle("习近平视察驻晋部队某基地");
        BannerData data3 = new BannerData();
        data3.setImgRes(R.mipmap.b3);
        data3.setTitle("刘奇葆出席中华文化走出去工作会议");
        list.add(data1);
        list.add(data2);
        list.add(data3);
        initBanner(list);
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainComponent.builder().appComponent(appComponent).build().inject(this);
    }

    @Override
    public void showError(String err) {
        dismissDialog();
    }

    @Override
    public void complete() {
        dismissDialog();
    }


    public void initBanner(final List<BannerData> data) {
        infos.clear();
        views.clear();
        infos.addAll(data);
        // 将最后一个ImageView添加进来
        views.add(getImageView(getActivity(), infos.get(infos.size() - 1)));
        for (int i = 0; i < infos.size(); i++) {
            views.add(getImageView(getActivity(), infos.get(i)));
        }
        // 将第一个ImageView添加进来
        views.add(getImageView(getActivity(), infos.get(0)));
        cycleViewPager.setScrollable(true);
        // 设置循环，在调用setData方法前调用
        cycleViewPager.setCycle(true);
        // 在加载数据前设置是否循环
        cycleViewPager.setData(views, infos, mAdCycleViewListener);
        //设置轮播
        cycleViewPager.setWheel(true);

        // 设置轮播时间，默认5000ms
        cycleViewPager.setTime(2000);
        //设置圆点指示图标组居中显示，默认靠右
//        cycleViewPager.setIndicatorCenter();
    }

    public View getImageView(Context context, final BannerData data) {


        View view = LayoutInflater.from(context).inflate(
                R.layout.view_banner, null);
//        Glide.with(getActivity()).load(data.getImgUrl()).into(imageView);

        ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        imageView.setImageResource(data.getImgRes());
        textView.setText(data.getTitle());
        return view;
    }

    private CycleViewPager.ImageCycleViewListener mAdCycleViewListener = new CycleViewPager.ImageCycleViewListener() {

        @Override
        public void onImageClick(BannerData info, int position, View imageView) {
            if (cycleViewPager.isCycle()) {
                position = position - 1;

            }
        }
    };



    @OnClick({R.id.ly_menu1_1, R.id.ly_menu1_2, R.id.ly_menu1_3, R.id.ly_menu1_4, R.id.ly_menu2_1, R.id.ly_menu2_2, R.id.ly_menu2_3, R.id.ly_menu2_4, R.id.ly_menu3_1, R.id.ly_menu3_2, R.id.ly_menu3_3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ly_menu1_1:
                break;
            case R.id.ly_menu1_2:
                break;
            case R.id.ly_menu1_3:
                break;
            case R.id.ly_menu1_4:
                break;
            case R.id.ly_menu2_1:
                break;
            case R.id.ly_menu2_2:
                break;
            case R.id.ly_menu2_3:
                break;
            case R.id.ly_menu2_4:
                break;
            case R.id.ly_menu3_1:
                SanhuiActivity.startActivity(getActivity());
                break;
            case R.id.ly_menu3_2:

                break;
            case R.id.ly_menu3_3:
                break;
        }
    }
}
