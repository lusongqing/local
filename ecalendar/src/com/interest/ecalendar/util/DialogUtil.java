package com.interest.ecalendar.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;

public class DialogUtil {
	// Define a dialog showing message
	public static void showDialog(final Context ctx, String msg) {
		AlertDialog.Builder builder = new AlertDialog.Builder(ctx).setMessage(
				msg).setCancelable(false);
		builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		builder.create().show();
	}

	// Define a dialog showing view
	public static void showDialog(Context ctx, View view) {
		new AlertDialog.Builder(ctx).setView(view).setCancelable(false)
				.setPositiveButton("OK", null).create().show();
	}
}
