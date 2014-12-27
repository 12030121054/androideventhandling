package com.example.eventhandling;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


@SuppressLint("DefaultLocale") public class MainActivity extends Activity {
 private Button btnclick;
 private EditText text;
 private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnclick=(Button)findViewById(R.id.btnclick);
        btn=(Button)findViewById(R.id.btn);
        text=(EditText)findViewById(R.id.text);
        OnClickListener listener = new OnClickListener() {
			
			@Override
			
			public void onClick(View v) { 
			Toast.makeText(getApplicationContext(),text.toString().toLowerCase(),Toast.LENGTH_LONG).show();
				
			}
		};
		btnclick.setOnClickListener(listener);
    }  
}
