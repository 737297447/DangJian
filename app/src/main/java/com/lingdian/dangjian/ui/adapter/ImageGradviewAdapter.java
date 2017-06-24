package com.lingdian.dangjian.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.lingdian.dangjian.R;
import com.lingdian.dangjian.base.Constant;
import com.lingdian.dangjian.util.CommonUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by C on 2017/6/23.
 */

public class ImageGradviewAdapter extends BaseAdapter {

    private List<String> list = new ArrayList<>();
    private Context context;


    public ImageGradviewAdapter(Context context){
        this.context = context;
    }

    public void onReference(List<String> list1) {
        if (list1 != null) {
            list.clear();
            list.addAll(list1);
            notifyDataSetChanged();
        }
    }



    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHodler hodler = null;
        if (convertView == null) {
            hodler = new ViewHodler();
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_small_image, parent, false);

            hodler.imageView =
                    (ImageView) convertView.findViewById(R.id.imageview);
            convertView.setTag(hodler);
        } else {
            hodler = (ViewHodler) convertView.getTag();
        }

        LinearLayout.LayoutParams linearParams =
                (LinearLayout.LayoutParams) hodler.imageView.getLayoutParams();
        int width = CommonUtils.getScreenMaxWidth(context, 130) / 4;
        linearParams.width =  width;
        linearParams.height = width;
        hodler.imageView.setLayoutParams(linearParams);


        Glide.with(context)
                .load(Constant.Image_Header + list.get(position))
                .placeholder(R.mipmap.icon_defout)
                .into(hodler.imageView);

        return convertView;
    }


    private class ViewHodler {
        public ImageView imageView;
    }


}
