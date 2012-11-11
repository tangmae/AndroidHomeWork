package com.example.lab1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;


public class SecondPage extends Activity {
	TextView selectedButton;
	RadioButton radioButton0, radioButton1, radioButton2;

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.secondpage_layout);
		radioButton0 = (RadioButton) findViewById(R.id.radio0);
		radioButton1 = (RadioButton) findViewById(R.id.radio1);
		radioButton2 = (RadioButton) findViewById(R.id.radio2);
		selectedButton = (TextView) findViewById(R.id.textView1);
		
	}
	
	public void selectButton0(View v){
		selectedButton.setText("Select Button 0");
		Intent intent = new Intent(this,ThirdPage.class);
		startActivity(intent);
	}
	public void selectButton1(View v){
		selectedButton.setText("Select Button 1");
		Intent intent = new Intent(this,ThirdPage.class);
		startActivity(intent);
	}
	public void selectButton2(View v){
		selectedButton.setText("Select Button 2");	
		Intent intent = new Intent(this,ThirdPage.class);
		startActivity(intent);
	}
	
	

}
