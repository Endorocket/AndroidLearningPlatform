package com.example.androidlearningplatform.tasks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androidlearningplatform.R;

public class MusicTaskActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_music_task);

    View nextButton = findViewById(R.id.music_task_next);
    nextButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MusicTaskActivity.this, PictureTaskActivity.class);
        MusicTaskActivity.this.startActivity(intent);
      }
    });
  }
}
