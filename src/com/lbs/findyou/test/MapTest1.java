package com.lbs.findyou.test;

import com.baidu.mapapi.map.MapView;
import com.lbs.findyou.R;

import android.app.Activity;
import android.os.Bundle;

public class MapTest1 extends Activity {
	
	MapView mMapView = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		System.out.println("MapTest1 onCreate");
		setContentView(R.layout.map_test_1);
		mMapView = (MapView)findViewById(R.id.bmapView);
		
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		System.out.println("MapTest1 onResume");
		mMapView.onResume();
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		System.out.println("MapTest1 onPause");
		mMapView.onPause();
		super.onPause();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		System.out.println("MapTest1 onDestroy");
		mMapView.onDestroy();
		super.onDestroy();
	}
	
}
