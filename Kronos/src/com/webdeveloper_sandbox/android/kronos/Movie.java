package com.webdeveloper_sandbox.android.kronos;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Movie extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.movie);
		
		VideoView videoView = (VideoView) findViewById(R.id.videoView1);
		videoView.setMediaController(new MediaController(this));
		
		Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.test);
		videoView.setVideoURI(uri);
		videoView.requestFocus();
		videoView.start();
		
		
		
	}

}
