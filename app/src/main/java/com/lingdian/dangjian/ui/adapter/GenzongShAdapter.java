package com.lingdian.dangjian.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.Constant;
import com.lingdian.dangjian.ui.bean.GenzongSh;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by longhy on 2016/5/3.
 */
public class GenzongShAdapter extends RecyclerView.Adapter<GenzongShAdapter.ViewHolder> {



    private Context context;
    private List<GenzongSh.DataListBean> list = new ArrayList<>();

    public GenzongShAdapter(Context context) {
        this.context = context;
    }


    public void onReference(List<GenzongSh.DataListBean> list1) {
        if (list1 != null) {
            list.clear();
            list.addAll(list1);
            notifyDataSetChanged();
        }
    }

    public void addOnReference(List<GenzongSh.DataListBean> list1) {
        if (list1 != null) {
            list.addAll(list1);
            notifyDataSetChanged();
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_gz, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        GenzongSh.DataListBean dataBean = list.get(position);


        holder.tvTitle.setText(dataBean.getTitle());
        holder.tvPeople.setText(dataBean.getPartyMemberName());

        holder.tvTime.setText(dataBean.getShowCreateTime());
        Glide.with(context)
                .load(Constant.Image_Header + dataBean.getThreelessonsType().getImgPath())
                .placeholder(R.mipmap.icon_defout)
                .into(holder.ivBg);



    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_bg)
        ImageView ivBg;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_people)
        TextView tvPeople;
        @BindView(R.id.tv_time)
        TextView tvTime;


        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
