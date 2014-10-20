package com.interest.ecalendar.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TextView;

import com.interest.ecalendar.R;

public class PostActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.post_activity);
		
		final TextView dateTextView = (TextView) findViewById(R.id.dateTextView);

		dateTextView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				DatePicker datePicker1 = (DatePicker) findViewById(R.id.datePicker1);
				System.out.println("datePicker1.getVisibility():"+datePicker1.getVisibility());
				if(datePicker1.getVisibility()==4){
					datePicker1.init(2014, 7, 29, new OnDateChangedListener() {
						
						@Override
						public void onDateChanged(DatePicker arg0, int year, int month, int day) {
							dateTextView.setText(year + "-" + month + "-" + day);
						}
					});
					datePicker1.setVisibility(0);//show
				}else {
					datePicker1.setVisibility(4); //hide
				}
			}
		});
		
		ImageView imgLink = (ImageView) findViewById(R.id.post_pic);
		imgLink.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(PostActivity.this,
						PostPictureActivity.class);
				startActivity(intent);
			}
		});
		
		TextView tvRegion = (TextView) findViewById(R.id.edit_region);
		tvRegion.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(PostActivity.this,
						PostProfileActivity.class);
				startActivity(intent);
			}
		});
		
	}

}
