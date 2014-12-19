package com.example.eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
 private Button btnclick;
 private EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnclick=(Button)findViewById(R.id.btnclick);
        text=(EditText)findViewById(R.id.text);
        OnClickListener listener = new OnClickListener() {
			
			@Override
			
			public void onClick(View v) { 
			Toast.makeText(getApplicationContext(),text.getText(),Toast.LENGTH_LONG).show();
				
			}
		};
		btnclick.setOnClickListener(listener);
    }  
}
