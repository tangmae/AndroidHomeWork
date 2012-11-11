package com.example.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdPage extends Activity {
	Button nextpage_button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.thirdpage_layout);
		nextpage_button = (Button) findViewById(R.id.nextP_button);
	}
	public void goNextPage(View v){
		Intent click_nextButton = new Intent(this,ForthPage.class);
		startActivity(click_nextButton);
		
		
	}
	
	

}
