package com.lingdian.dangjian.component;

import com.lingdian.dangjian.ui.activity.HuiyinbiDetailActivity;
import com.lingdian.dangjian.ui.activity.KaoshiActivity;
import com.lingdian.dangjian.ui.activity.LoginActivity;
import com.lingdian.dangjian.ui.activity.SanhuiActivity;
import com.lingdian.dangjian.ui.activity.WentiQiangDetailActivity;
import com.lingdian.dangjian.ui.activity.XindeActivity;
import com.lingdian.dangjian.ui.fragment.Gz1Fragment;
import com.lingdian.dangjian.ui.fragment.Gz2Fragment;
import com.lingdian.dangjian.ui.fragment.HuiyinbiFragment;
import com.lingdian.dangjian.ui.fragment.Main1Fragment;
import com.lingdian.dangjian.ui.fragment.Main2Fragment;
import com.lingdian.dangjian.ui.fragment.Main3Fragment;
import com.lingdian.dangjian.ui.fragment.Main4Fragment;
import com.lingdian.dangjian.ui.fragment.WentiQiangFragment;

import dagger.Component;

/**
 * Created by Administrator on 2016/11/7.
 * 用@Component表示这个接口是一个连接器，能用@Component注解的只能是interface或者抽象类
 */

@Component(dependencies = AppComponent.class)
public interface MainComponent {


    Main1Fragment inject(Main1Fragment fragment);
    Main2Fragment inject(Main2Fragment fragment);
    Main3Fragment inject(Main3Fragment fragment);
    Main4Fragment inject(Main4Fragment fragment);
    Gz1Fragment inject(Gz1Fragment fragment);
    Gz2Fragment inject(Gz2Fragment fragment);
    WentiQiangFragment inject(WentiQiangFragment fragment);
    HuiyinbiFragment inject(HuiyinbiFragment fragment);
    LoginActivity inject(LoginActivity activity);

    XindeActivity inject(XindeActivity activity);
    KaoshiActivity inject(KaoshiActivity activity);
    WentiQiangDetailActivity inject(WentiQiangDetailActivity activity);
    HuiyinbiDetailActivity inject(HuiyinbiDetailActivity activity);
    SanhuiActivity inject(SanhuiActivity activity);
}
