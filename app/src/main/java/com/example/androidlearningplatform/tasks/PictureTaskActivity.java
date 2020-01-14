package com.example.androidlearningplatform.tasks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.androidlearningplatform.R;

public class PictureTaskActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_picture_task);

    Intent intent = getIntent();
    final Bundle bundle = intent.getExtras();

    final View nextButton = findViewById(R.id.picture_task_next);
    final RadioGroup radioGroup = findViewById(R.id.radioGroupPicture);

    nextButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        if (radioGroup.getCheckedRadioButtonId() == -1) {
          Toast.makeText(PictureTaskActivity.this, "Wybierz odpowiedź", Toast.LENGTH_SHORT).show();
        } else {
          Intent intent = new Intent(PictureTaskActivity.this, FilmTaskActivity.class);
          bundle.putInt("pictureAnswer", radioGroup.getCheckedRadioButtonId());
          intent.putExtras(bundle);
          PictureTaskActivity.this.startActivity(intent);
        }
      }
    });


  }
}
