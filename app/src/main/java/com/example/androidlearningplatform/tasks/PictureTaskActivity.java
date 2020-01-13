package com.example.androidlearningplatform.tasks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androidlearningplatform.R;

public class PictureTaskActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_picture_task);

    View nextButton = findViewById(R.id.picture_task_next);
    nextButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(PictureTaskActivity.this, FilmTaskActivity.class);
        PictureTaskActivity.this.startActivity(intent);
      }
    });
  }
}
