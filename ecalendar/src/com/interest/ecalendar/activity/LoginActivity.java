package com.interest.ecalendar.activity;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.interest.ecalendar.R;
import com.interest.ecalendar.util.DialogUtil;
import com.interest.ecalendar.util.HttpUtil;
import com.interest.ecalendar.util.SharedPerferencesUtil;

/**
 * Welcome page login
 * 
 */
public class LoginActivity extends Activity {
	
	private EditText etUserName;
	private EditText etPassword;
	private Button bnGo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		etUserName = (EditText) findViewById(R.id.username);
        etPassword = (EditText) findViewById(R.id.password);
        bnGo = (Button) findViewById(R.id.goBtn);
        
		//get previous user name from SharedPreferences
        String previousUserName = SharedPerferencesUtil.getString(LoginActivity.this, "USER_NAME", "none");
        if(!"none".equals(previousUserName)){
        	etUserName.setText(previousUserName);
        	etPassword.requestFocus();
        }
        
		bnGo.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (validate()){
					if (login()){
						//Save current user name to SharedPreferences
						SharedPerferencesUtil.putString(LoginActivity.this, "USER_NAME", etUserName.getText().toString());
						
						Intent intent = new Intent(LoginActivity.this,
								MonthViewActivity.class);
						startActivity(intent);
						
						finish();
					}
				}
			}
		});
	}
	
	private boolean validate()
	{
		String userName = etUserName.getText().toString();
		if (userName.equals(""))
		{
			DialogUtil.showDialog(this, "User name is required!");
			return false;
		}
		String password = etPassword.getText().toString();
		if (password.equals(""))
		{
			DialogUtil.showDialog(this, "Password is required!");
			return false;
		}
		return true;
	}
	
	private boolean login()
	{
		String userName = etUserName.getText().toString();
		String password = etPassword.getText().toString();
		
		if(userName.length() == 8){
			return true;
		}else{
			return false;
		}
		
		//Sample of Http Client
		//JSONObject jsonObj;
		//try
		//{
		//	Map<String, String> map = new HashMap<String, String>();
		//	map.put("user", userName);
		//	map.put("pass", password);
		//	String url = HttpUtil.BASE_URL + "login.jsp";
		//	
		//	jsonObj = new JSONObject(HttpUtil.postRequest(url, map));
		//	
		//	if (jsonObj.getInt("userId") > 0)  
		//	{
		//		return true;
		//	}else{ //-1
		//		DialogUtil.showDialog(LoginActivity.this, "User name or password is invalid, please try again!");
		//	}
		//}
		//catch (Exception e)
		//{
		//	DialogUtil.showDialog(this, "network or server error occurs, please try later!");
		//	e.printStackTrace();
		//}
		//
		//return false;
	}
	
}

//Sample of Server Side Servlet

//@WebServlet(urlPatterns="/mobile/login.jsp")
//public class LoginServlet extends BaseServlet
//{
//    public void service(HttpServletRequest request ,
//		HttpServletResponse response)
//		throws IOException , ServletException
//	{
//		String user = request.getParameter("user");
//		String pass = request.getParameter("pass");
//		EcalendarManager ecalendarManager = (EcalendarManager)getCtx().getBean("mgr");
//		int userId = ecalendarManager.validLogin(user , pass);
//		response.setContentType("text/html; charset=utf-8");
//		if (userId > 0) //login successfully
//		{
//			request.getSession(true).setAttribute("userId" , userId);
//		}
//		try
//		{
//			JSONObject jsonObj = new JSONObject().put("userId" , userId);
//			response.getWriter().println(jsonObj.toString());
//		}
//		catch (JSONException ex)
//		{
//			ex.printStackTrace();
//		}
//	}
//}