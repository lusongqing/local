/**
 *
 */
package com.interest.ecalendar.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPerferencesUtil
{
	public static void putString(Context ctx, String key, String value) 
	{
        SharedPreferences sp2 = ctx.getSharedPreferences("SP", Context.MODE_PRIVATE);
        Editor editor = sp2.edit();
        editor.putString(key, value);
        editor.commit();
	}

	public static String getString(Context ctx, String key, String defaultValue)
		{ 
	        SharedPreferences sp = ctx.getSharedPreferences("SP", Context.MODE_PRIVATE);
	        return sp.getString(key, defaultValue==null?"none":defaultValue);
		}
}
