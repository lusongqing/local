package com.interest.ecalendar.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.interest.ecalendar.R;
import com.interest.ecalendar.activity.ListActivity;
import com.interest.ecalendar.activity.MonthViewActivity;
import com.interest.ecalendar.activity.PostActivity;
import com.interest.ecalendar.activity.ProfileActivity;

public class MenuFragment extends Fragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		// return super.onCreateView(inflater, container, savedInstanceState);
		View view = inflater.inflate(R.layout.menu_fragment, container, true);
		
		ImageView menuMonthView = (ImageView) view.findViewById(R.id.menuMonthView);

		menuMonthView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getActivity(), MonthViewActivity.class);
				startActivity(intent);
			}
		});
		
		ImageView menuActivityList = (ImageView) view.findViewById(R.id.menuActivityList);

		menuActivityList.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getActivity(), ListActivity.class);
				startActivity(intent);
			}
		});
		
		ImageView menuPost = (ImageView) view.findViewById(R.id.menuPost);

		menuPost.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getActivity(), PostActivity.class);
				startActivity(intent);
			}
		});
		
		ImageView menuProfile = (ImageView) view.findViewById(R.id.menuProfile);

		menuProfile.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getActivity(), ProfileActivity.class);
				startActivity(intent);
			}
		});
		return view;
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
}
