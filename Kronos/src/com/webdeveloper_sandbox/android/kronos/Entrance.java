package com.webdeveloper_sandbox.android.kronos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Entrance extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(this);
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if (v.getId() == R.id.button1) {
			Intent intent = new Intent(this, Movie.class);
			startActivity(intent);
		}
		
	}
}