package com.lingdian.dangjian.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.Constant;
import com.lingdian.dangjian.ui.bean.Xinde;
import com.lingdian.dangjian.util.TimeUtils;
import com.lingdian.dangjian.view.CircleImageView;
import com.lingdian.dangjian.view.CustomGridView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by longhy on 2016/5/3.
 */
public class XindeAdapter extends RecyclerView.Adapter<XindeAdapter.ViewHolder> {


    private Context context;
    private List<Xinde.DataListBean> list = new ArrayList<>();

    public XindeAdapter(Context context) {
        this.context = context;
    }


    public void onReference(List<Xinde.DataListBean> list1) {
        if (list1 != null) {
            list.clear();
            list.addAll(list1);
            notifyDataSetChanged();
        }
    }

    public void addOnReference(List<Xinde.DataListBean> list1) {
        if (list1 != null) {
            list.addAll(list1);
            notifyDataSetChanged();
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_xinde, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Xinde.DataListBean dataBean = list.get(position);
        holder.tvUsername.setText(dataBean.getPartyMember().getName());
        Glide.with(context)
                .load(Constant.Image_Header + dataBean.getPartyMember().getPhotoPath())
                .placeholder(R.mipmap.icon_defout)
                .into(holder.ivUsericon);

        holder.tvPosition.setText(dataBean.getBelongBranch().getName());
        holder.tvTime.setText(TimeUtils.formatTime11(dataBean.getShowCreateTime()));
        holder.tvTitle.setText(dataBean.getTitle());
        holder.tvContent.setText(dataBean.getContent());

        holder.adapter = new ImageGradviewAdapter(context);
        holder.gridview.setAdapter(holder.adapter);
        holder.adapter.onReference(dataBean.getImgPath());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.iv_usericon)
        CircleImageView ivUsericon;
        @BindView(R.id.tv_username)
        TextView tvUsername;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_content)
        TextView tvContent;
        @BindView(R.id.gridview)
        CustomGridView gridview;
        @BindView(R.id.tv_position)
        TextView tvPosition;
        @BindView(R.id.tv_time)
        TextView tvTime;

        public ImageGradviewAdapter adapter;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
