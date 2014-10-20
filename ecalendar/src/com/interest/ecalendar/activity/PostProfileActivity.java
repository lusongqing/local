package com.interest.ecalendar.activity;

import com.interest.ecalendar.R;
import com.interest.ecalendar.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class PostProfileActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.post_profile);
		findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
	}

}
