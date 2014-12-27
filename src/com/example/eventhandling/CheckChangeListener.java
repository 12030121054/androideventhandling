package com.example.eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class CheckChangeListener extends Activity {
	private RadioGroup rgCase;
     private EditText editString;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_change_listener);
		rgCase=(RadioGroup)findViewById(R.id.rgCase);
		editString= (EditText)findViewById(R.id.editText);
	OnCheckedChangeListener listener = new 	OnCheckedChangeListener() {
		
		@Override
		public void onCheckedChanged(RadioGroup arg0, int id) {
			String newString;
			switch(id)
			{
			case R.id.lCase:
				 newString=editString.getText().toString().toLowerCase();
				editString.setText(newString);
				break;
			case R.id.uCase:
				 newString=editString.getText().toString().toUpperCase();
					editString.setText(newString);
				break;
			}
			
		}
	};

		
	}

	

}
