package com.database.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HttpExample extends Activity {
    TextView httpStuff;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		httpStuff = (TextView) findViewById(R.id.tvTwitter);
		twitterData test = new twitterData();
		String returned;
		try{
		    returned = test.getInternetData();
			httpStuff.setText(returned);
		}catch(Exception e){
		    e.printStackTrace();
		}
	}


	
	

}