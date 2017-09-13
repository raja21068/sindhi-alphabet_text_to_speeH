package net.viralpatel.android.speechtotextdemo;
import java.util.Locale;

import android.os.Bundle;
import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class speek extends Activity implements OnClickListener, OnInitListener {

	private TextToSpeech tts;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tts = new TextToSpeech(this, this);
		
	}

	@Override
	public void onClick(View v) {
		
	}
	public void speed(String t){
		if (tts!=null) {
			String text = t;
			if (text!=null) {
				if (!tts.isSpeaking()) {
					tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
				}
			}
		}
		
	}

	@Override
	public void onInit(int code) {
		if (code==TextToSpeech.SUCCESS) {
			tts.setLanguage(Locale.getDefault());
		} else {
			tts = null;
			Toast.makeText(this, "Failed to initialize TTS engine.", Toast.LENGTH_SHORT).show();
		}
	}
	
	@Override
	protected void onDestroy() {
		if (tts!=null) {
			tts.stop();
            tts.shutdown();
		}
		super.onDestroy();
	}

}
