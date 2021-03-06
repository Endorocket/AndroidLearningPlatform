package com.example.androidlearningplatform.tasks;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.androidlearningplatform.R;
import com.example.androidlearningplatform.results.MusicResultActivity;

public class FilmTaskActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_film_task);

    Intent intent = getIntent();
    final Bundle bundle = intent.getExtras();

    final View btnNext = findViewById(R.id.film_task_next);
    final View btnPlay = findViewById(R.id.btnPlayFilm);
    final View btnStop = findViewById(R.id.btnStopFilm);
    final VideoView video = findViewById(R.id.videoView);
    final RadioGroup radioGroup = findViewById(R.id.radioGroupFilm);

    MediaController mediaController = new MediaController(this);
    video.setMediaController(mediaController);
    String path = "android.resource://com.example.androidlearningplatform/" + R.raw.lord_of_rings;
    Uri uri = Uri.parse(path);
    video.setVideoURI(uri);

    btnPlay.setOnClickListener(v -> video.start());

    btnStop.setOnClickListener(v -> video.pause());

    btnNext.setOnClickListener(v -> {
      if (radioGroup.getCheckedRadioButtonId() == -1) {
        Toast.makeText(FilmTaskActivity.this, "Wybierz odpowiedź", Toast.LENGTH_SHORT).show();
      } else {
        Intent intent1 = new Intent(FilmTaskActivity.this, MusicResultActivity.class);
        bundle.putInt("filmAnswer", radioGroup.getCheckedRadioButtonId());
        intent1.putExtras(bundle);
        FilmTaskActivity.this.startActivity(intent1);
      }
    });
  }
}
