package com.example.androidlearningplatform.tasks;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.androidlearningplatform.R;

public class MusicTaskActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_music_task);

    final View nextButton = findViewById(R.id.music_task_next);
    final View btnPlayMusic = findViewById(R.id.btnPlayMusic);
    final View btnStopMusic = findViewById(R.id.btnStopMusic);
    final RadioGroup radioGroup = findViewById(R.id.radioGroupMusic);

    final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.interstellar_music);

    btnPlayMusic.setOnClickListener(v -> {
      if (!mediaPlayer.isPlaying())
        mediaPlayer.start();
    });

    btnStopMusic.setOnClickListener(v -> {
      if (mediaPlayer.isPlaying())
        mediaPlayer.pause();
    });

    nextButton.setOnClickListener(v -> {

      if (radioGroup.getCheckedRadioButtonId() == -1) {
        Toast.makeText(MusicTaskActivity.this, "Wybierz odpowiedź", Toast.LENGTH_SHORT).show();
      } else {
        if (mediaPlayer.isPlaying())
          mediaPlayer.pause();

        Intent intent = new Intent(MusicTaskActivity.this, PictureTaskActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("musicAnswer", radioGroup.getCheckedRadioButtonId());
        intent.putExtras(bundle);
        MusicTaskActivity.this.startActivity(intent);
      }
    });
  }
}
