package com.lingdian.dangjian.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * @description: shuzixiaoyuan
 * @author: wragony
 * @email: wragony@163.com
 * @createDate: 2014年4月22日
 */
public class CustomGridView extends GridView {

	public CustomGridView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public CustomGridView(Context context) {
		super(context);
	}

	public CustomGridView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}

}
