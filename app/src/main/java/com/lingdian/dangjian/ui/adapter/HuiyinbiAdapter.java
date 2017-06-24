package com.lingdian.dangjian.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lingdian.dangjian.R;
import com.lingdian.dangjian.ui.activity.HuiyinbiDetailActivity;
import com.lingdian.dangjian.ui.bean.Huiyinbi;
import com.lingdian.dangjian.view.StarBarView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by longhy on 2016/5/3.
 */
public class HuiyinbiAdapter extends RecyclerView.Adapter<HuiyinbiAdapter.ViewHolder> {


    private Context context;
    private String menuType;
    private List<Huiyinbi.DataListBean> list = new ArrayList<>();

    public HuiyinbiAdapter(Context context, String menuType) {
        this.context = context;
        this.menuType = menuType;
    }


    public void onReference(List<Huiyinbi.DataListBean> list1) {
        if (list1 != null) {
            list.clear();
            list.addAll(list1);
            notifyDataSetChanged();
        }
    }

    public void addOnReference(List<Huiyinbi.DataListBean> list1) {
        if (list1 != null) {
            list.addAll(list1);
            notifyDataSetChanged();
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_huiyinbi, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final Huiyinbi.DataListBean dataBean = list.get(position);
        holder.tvUsername.setText(dataBean.getQuizMemberName());
        holder.tvDetail.setText(dataBean.getTitle());
        holder.tvContent.setText(dataBean.getEchoWallReplyContent());
        holder.tvPosition.setText(dataBean.getQuizBranchName());
        holder.tvTime.setText(dataBean.getShowCreateTime());
        if (dataBean.getClassify().equals("OC")) {
            holder.ivType.setImageResource(R.mipmap.icon_org_js);
        } else if (dataBean.getClassify().equals("IC")) {
            holder.ivType.setImageResource(R.mipmap.icon_chanye);
        } else if (dataBean.getClassify().equals("PL")) {
            holder.ivType.setImageResource(R.mipmap.icon_ms_shishi);
        } else if (dataBean.getClassify().equals("DM")) {
            holder.ivType.setImageResource(R.mipmap.icon_mz_manager);
        } else if (dataBean.getClassify().equals("PA")) {
            holder.ivType.setImageResource(R.mipmap.icon_jz_fupin);
        } else {
            holder.ivType.setImageResource(R.mipmap.icon_org_js);
        }

        if (!TextUtils.isEmpty(dataBean.getSatisfaction())){
            holder.sbvStarbar.setStarRating(Float.valueOf(dataBean.getSatisfaction()));
        }else{
            holder.sbvStarbar.setStarRating(0);
        }




        holder.tvShui.setText(dataBean.getEchoWallBranchName()+"回复：");

        holder.lyWenti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HuiyinbiDetailActivity.startActivity(context, menuType, dataBean.getId());
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
        @BindView(R.id.iv_type)
        ImageView ivType;
        @BindView(R.id.sbv_starbar)
        StarBarView sbvStarbar;
        @BindView(R.id.tv_shui)
        TextView tvShui;
        @BindView(R.id.tv_content)
        TextView tvContent;
        @BindView(R.id.tv_position)
        TextView tvPosition;
        @BindView(R.id.tv_time)
        TextView tvTime;
        @BindView(R.id.ly_wenti)
        LinearLayout lyWenti;


        public ImageGradviewAdapter adapter;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
