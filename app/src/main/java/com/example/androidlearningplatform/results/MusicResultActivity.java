package com.example.androidlearningplatform.results;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.androidlearningplatform.R;

public class MusicResultActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_music_result);

    Intent intent = getIntent();
    final Bundle bundle = intent.getExtras();

    final View btnNext = findViewById(R.id.btnMusicResultNext);
    final ImageView userChoiceGravity = findViewById(R.id.userChoiceGravity);
    final ImageView userChoiceMartian = findViewById(R.id.userChoiceMartian);
    final ImageView userChoiceInterstellar = findViewById(R.id.userChoiceInterstellar);

    int musicAnswer = bundle.getInt("musicAnswer");

    switch(musicAnswer) {
      case R.id.radioBtnGravity:
        userChoiceGravity.setVisibility(View.VISIBLE);
        break;
      case R.id.radioBtnMartian:
        userChoiceMartian.setVisibility(View.VISIBLE);
        break;
      case R.id.radioBtnInterstellar:
        userChoiceInterstellar.setVisibility(View.VISIBLE);
        break;
    }

    btnNext.setOnClickListener(v -> {
      Intent intent1 = new Intent(MusicResultActivity.this, PictureResultActivity.class);
      intent1.putExtras(bundle);
      MusicResultActivity.this.startActivity(intent1);
    });
  }
}
