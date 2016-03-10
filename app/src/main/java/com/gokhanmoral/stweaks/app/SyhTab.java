package com.gokhanmoral.stweaks.app;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class SyhTab {
	public String name;
	public List<SyhPane> panes; 
	protected Context mContext;
	protected Activity mActivity;

	public SyhTab(Context context, Activity activity)
	{
		name = "";
		panes = new ArrayList<SyhPane>();
		mContext = context;
		mActivity = activity;
	}
	public View getCustomView(ViewGroup parent)
	{
		return null;
	}
}
