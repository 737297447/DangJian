package com.lingdian.dangjian.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lingdian.dangjian.R;
import com.lingdian.dangjian.ui.activity.WentiQiangDetailActivity;
import com.lingdian.dangjian.ui.bean.WentiQiang;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by longhy on 2016/5/3.
 */
public class WentiQiangAdapter extends RecyclerView.Adapter<WentiQiangAdapter.ViewHolder> {



    private Context context;
    private String menuType;
    private List<WentiQiang.DataListBean> list = new ArrayList<>();

    public WentiQiangAdapter(Context context,String menuType) {
        this.context = context;
        this.menuType = menuType;
    }


    public void onReference(List<WentiQiang.DataListBean> list1) {
        if (list1 != null) {
            list.clear();
            list.addAll(list1);
            notifyDataSetChanged();
        }
    }

    public void addOnReference(List<WentiQiang.DataListBean> list1) {
        if (list1 != null) {
            list.addAll(list1);
            notifyDataSetChanged();
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_wentiqiang, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final WentiQiang.DataListBean dataBean = list.get(position);
        holder.tvUsername.setText(dataBean.getQuizMemberName());
        holder.tvDetail.setText(dataBean.getTitle());
        holder.tvContent.setText(dataBean.getContent());
        holder.tvPosition.setText(dataBean.getQuizBranchName());
        holder.tvTime.setText(dataBean.getShowCreateTime());
        if (dataBean.getClassify().equals("OC")){
            holder.ivType.setImageResource(R.mipmap.icon_org_js);
        }else if (dataBean.getClassify().equals("IC")){
            holder.ivType.setImageResource(R.mipmap.icon_chanye);
        }else if (dataBean.getClassify().equals("PL")){
            holder.ivType.setImageResource(R.mipmap.icon_ms_shishi);
        }else if (dataBean.getClassify().equals("DM")){
            holder.ivType.setImageResource(R.mipmap.icon_mz_manager);
        }else if (dataBean.getClassify().equals("PA")){
            holder.ivType.setImageResource(R.mipmap.icon_jz_fupin);
        }else{
            holder.ivType.setImageResource(R.mipmap.icon_org_js);
        }

        holder.ly_wenti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WentiQiangDetailActivity.startActivity(context,menuType,dataBean);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_username)
        TextView tvUsername;
        @BindView(R.id.tv_detail)
        TextView tvDetail;
        @BindView(R.id.tv_content)
        TextView tvContent;
        @BindView(R.id.tv_position)
        TextView tvPosition;
        @BindView(R.id.tv_time)
        TextView tvTime;
        @BindView(R.id.iv_type)
        ImageView ivType;
        @BindView(R.id.ly_wenti)
        LinearLayout ly_wenti;



        public ImageGradviewAdapter adapter;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
