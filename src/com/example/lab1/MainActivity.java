package com.example.lab1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Button nextPageButton;
	TextView helloTextView; 

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextPageButton = (Button) findViewById(R.id.button1);
        helloTextView = (TextView) findViewById(R.id.textView1);
        helloTextView.setText("");
//        nextPageButton.setOnClickListener(l)
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public void goNextPage(View v){
    	Intent intent = new Intent(this,SecondPage.class);
    	startActivity(intent);

    }
    
    
    
    
    
}
