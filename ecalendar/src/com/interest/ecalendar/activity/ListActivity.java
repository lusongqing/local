package com.interest.ecalendar.activity;

import com.interest.ecalendar.R;
import com.interest.ecalendar.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class ListActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		
		TextView commentLink1 = (TextView) findViewById(R.id.activity1ComLinkImgView);

		commentLink1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(ListActivity.this,
						CommentActivity.class);
				startActivity(intent);
			}
		});
		
		TextView commentLink2 = (TextView) findViewById(R.id.activity2ComLinkImgView);

		commentLink2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(ListActivity.this,
						CommentActivity.class);
				startActivity(intent);
			}
		});
		
		TextView commentLink3 = (TextView) findViewById(R.id.activity3ComLinkImgView);

		commentLink3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(ListActivity.this,
						CommentActivity.class);
				startActivity(intent);
			}
		});
		
		TextView commentLink4 = (TextView) findViewById(R.id.activity4ComLinkImgView);

		commentLink4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(ListActivity.this,
						CommentActivity.class);
				startActivity(intent);
			}
		});
		
		TextView commentLink5 = (TextView) findViewById(R.id.activity5ComLinkImgView);

		commentLink5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(ListActivity.this,
						CommentActivity.class);
				startActivity(intent);
			}
		});
		
	}

}
