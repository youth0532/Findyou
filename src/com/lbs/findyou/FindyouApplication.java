package com.lbs.findyou;

import com.baidu.mapapi.SDKInitializer;

import android.app.Application;

public class FindyouApplication extends Application {

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		System.out.println("FindyouApplication onCreate");
		//SDK initializer
		SDKInitializer.initialize(getApplicationContext());
		super.onCreate();
	}
	
}
