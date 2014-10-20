package com.interest.ecalendar.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.interest.ecalendar.R;

public class MonthViewActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.month_view);

		// View root = this.getLayoutInflater().inflate(R.layout.picture_list,
		// null);
		// final PopupWindow popup = new PopupWindow(root, 280, 360);
		//
		// ImageView imgLink = (ImageView)
		// findViewById(R.id.activity1AttLinkImgView);
		//
		// imgLink.setOnClickListener(new OnClickListener() {
		// @Override
		// public void onClick(View v) {
		// //popup.showAsDropDown(v);
		// popup.showAtLocation(findViewById(R.id.container), Gravity.CENTER, 0,
		// 0);
		// }
		// });
		// root.findViewById(R.id.close).setOnClickListener(
		// new View.OnClickListener() {
		// public void onClick(View v) {
		// popup.dismiss();
		// }
		// });
		
		ImageView imgLink = (ImageView) findViewById(R.id.activity1AttLinkImgView);
		imgLink.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MonthViewActivity.this,
						ListPictureActivity.class);
				startActivity(intent);
			}
		});

		TextView commentLink1 = (TextView) findViewById(R.id.activity1ComLinkImgView);

		commentLink1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MonthViewActivity.this,
						CommentActivity.class);
				startActivity(intent);
			}
		});

		TextView commentLink2 = (TextView) findViewById(R.id.activity2ComLinkImgView);

		commentLink2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MonthViewActivity.this,
						CommentActivity.class);
				startActivity(intent);
			}
		});

	}

}
