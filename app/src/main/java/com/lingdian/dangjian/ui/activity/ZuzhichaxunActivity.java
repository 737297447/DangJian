package com.lingdian.dangjian.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.gyf.barlibrary.ImmersionBar;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.BaseRVActivity;
import com.lingdian.dangjian.component.AppComponent;
import com.lingdian.dangjian.component.DaggerMainComponent;
import com.lingdian.dangjian.ui.bean.Zuzhichaxun;
import com.lingdian.dangjian.ui.contract.ZuzhichaxunContract;
import com.lingdian.dangjian.ui.presenter.ZuzhichaxunPresenter;
import com.lingdian.dangjian.util.SPUtils;
import com.lingdian.dangjian.view.tree.Bean;
import com.lingdian.dangjian.view.tree.Node;
import com.lingdian.dangjian.view.tree.SimpleTreeAdapter;
import com.lingdian.dangjian.view.tree.TreeListViewAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class ZuzhichaxunActivity extends BaseRVActivity<ZuzhichaxunPresenter> implements ZuzhichaxunContract.View {
    @BindView(R.id.left_image)
    ImageView leftImage;
    @BindView(R.id.center_text)
    TextView centerText;
    @BindView(R.id.right_text)
    TextView rightText;
    @BindView(R.id.id_tree)
    ListView idTree;


    private List<Bean> mDatas = new ArrayList<Bean>();

    private List<Zuzhichaxun> mDatas2 = new ArrayList<>();
    private ListView mTree;
    private TreeListViewAdapter mAdapter;
    private String SESSIONID;

    @Override
    public int getLayoutId() {
        return R.layout.activity_zuzhichaxun;
    }

    @Override
    public void configViews() {
        ImmersionBar.with(this)
                .statusBarDarkFont(false)
                .statusBarColor(R.color.colorPrimary)
                .fitsSystemWindows(true)
                .init();
        initDatas11();
        centerText.setText("组织查询");
        rightText.setVisibility(View.VISIBLE);
        rightText.setText("刷新");
        SESSIONID = SPUtils.getUser(this).getSESSIONID();
        mTree = (ListView) findViewById(R.id.id_tree);
        try {
            mAdapter = new SimpleTreeAdapter<Bean>(mTree, this, mDatas, 0);
            mAdapter.setOnTreeNodeClickListener(new TreeListViewAdapter.OnTreeNodeClickListener() {
                @Override
                public void onClick(Node node, int position) {
                    if (node.isLeaf()) {
                        Toast.makeText(getApplicationContext(), node.getName(),
                                Toast.LENGTH_SHORT).show();
                    }
                }

            });

        } catch (Exception e) {
            e.printStackTrace();
        }
        mTree.setAdapter(mAdapter);
    }

    @Override
    public void initDatas() {
      mPresenter.sendBranch("","",SESSIONID);
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainComponent.builder().appComponent(appComponent).build().inject(this);
    }


    private Zuzhichaxun zuzhichaxun;
    private void initDatas11() {
        zuzhichaxun = new Zuzhichaxun();
        zuzhichaxun.setLevel("111");
        mDatas.add(new Bean(1, 0, "根目录1",null));
        mDatas.add(new Bean(2, 0, "根目录2",null));
        mDatas.add(new Bean(3, 0, "根目录3",null));
        mDatas.add(new Bean(4, 0, "根目录4",null));

        mDatas.add(new Bean(5, 1, "子目录1-1",null));
        mDatas.add(new Bean(6, 1, "子目录1-2",null));

        mDatas.add(new Bean(7, 5, "子目录1-1-1",null));
        mDatas.add(new Bean(8, 2, "子目录2-1",null));

        mDatas.add(new Bean(9, 4, "子目录4-1",null));
        mDatas.add(new Bean(10, 4, "子目录4-2",null));

        mDatas.add(new Bean(11, 10, "子目录4-2-1",null));
        mDatas.add(new Bean(12, 10, "子目录4-2-3",null));
        mDatas.add(new Bean(13, 10, "子目录4-2-2",null));
        mDatas.add(new Bean(14, 9, "子目录4-1-1",null));
        mDatas.add(new Bean(15, 9, "子目录4-1-2",null));
        mDatas.add(new Bean(16, 9, "子目录4-1-3",null));


        mDatas.add(new Bean(17, 1, "子目录1-3",null));
        mDatas.add(new Bean(18, 3, "",zuzhichaxun));

//		mDatas2.add(new FileBean(1, 0, "文件管理系统"));
//        mDatas2.add(new FileBean(2, 1, "游戏"));
//        mDatas2.add(new FileBean(3, 1, "文档"));
//        mDatas2.add(new FileBean(4, 1, "程序"));
//        mDatas2.add(new FileBean(5, 2, "war3"));
//        mDatas2.add(new FileBean(6, 2, "刀塔传奇"));
//
//        mDatas2.add(new FileBean(7, 4, "面向对象"));
//        mDatas2.add(new FileBean(8, 4, "非面向对象"));
//
//        mDatas2.add(new FileBean(9, 7, "C++"));
//        mDatas2.add(new FileBean(10, 7, "JAVA"));
//        mDatas2.add(new FileBean(11, 7, "Javascript"));
//        mDatas2.add(new FileBean(12, 8, "C"));

    }



    @Override
    public void showError(String err) {

    }

    @Override
    public void showZuzhi(Zuzhichaxun zuzhichaxun) {
//        try {
//            mAdapter.AddListOnReference(zuzhichaxun.getZtreeNodes());
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void complete() {

    }





    public static void startActivity(Context context) {
        Intent i = new Intent(context, ZuzhichaxunActivity.class);
        context.startActivity(i);
    }

    @OnClick({R.id.left_image, R.id.right_text})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.left_image:
                finish();
                break;
            case R.id.right_text:
                try {
                    mAdapter.AddOnReference(new Bean(18, 3, "",null));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

                break;
        }
    }
}
