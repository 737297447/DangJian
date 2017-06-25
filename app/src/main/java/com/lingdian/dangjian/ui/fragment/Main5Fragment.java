package com.lingdian.dangjian.ui.fragment;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseFragment;
import com.lingdian.dangjian.component.AppComponent;

import butterknife.BindView;


/**
 * Created by Administrator on 2017/1/22.
 * 办事中心页面
 */

public class Main5Fragment extends BaseFragment {


    @BindView(R.id.left_image)
    ImageView leftImage;
    @BindView(R.id.center_text)
    TextView centerText;
    @BindView(R.id.progressBar1)
    ProgressBar pg1;
    @BindView(R.id.webview1)
    WebView webView;

    public static Main5Fragment newInstance() {
        Main5Fragment f = new Main5Fragment();
        Bundle b = new Bundle();
        b.putString("type", "Main2Fragment");
        f.setArguments(b);
        return f;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_main5;
    }

    @Override
    protected void immersionInit() {

    }

    @Override
    public void configViews() {
        leftImage.setVisibility(View.INVISIBLE);
        centerText.setText("党建网");

    }

    @Override
    public void initDatas() {

        webView.setWebViewClient(new WebViewClient(){
            //覆写shouldOverrideUrlLoading实现内部显示网页
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO 自动生成的方法存根
                view.loadUrl(url);
                return true;
            }
        });
        WebSettings seting=webView.getSettings();
        seting.setJavaScriptEnabled(true);//设置webview支持javascript脚本
        seting.setSupportZoom(true);
        seting.setBuiltInZoomControls(true);
        seting.setDisplayZoomControls(false);
        webView.setInitialScale(75);//为25%，最小缩放等级

        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                // TODO 自动生成的方法存根

                if(newProgress==100){
                    pg1.setVisibility(View.GONE);//加载完网页进度条消失
                }
                else{
                    pg1.setVisibility(View.VISIBLE);//开始加载网页时显示进度条
                    pg1.setProgress(newProgress);//设置进度值
                }

            }
        });

        webView.loadUrl("http://www.dangjian.cn/");

    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
    }


    @Override
    public void attachView() {

    }



}
