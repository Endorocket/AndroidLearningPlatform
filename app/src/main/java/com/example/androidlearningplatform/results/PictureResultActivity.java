package com.example.androidlearningplatform.results;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.androidlearningplatform.R;

public class PictureResultActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_picture_result);

    Intent intent = getIntent();
    final Bundle bundle = intent.getExtras();

    final View btnNext = findViewById(R.id.btnPictureResultNext);
    final ImageView userChoiceLeonardo = findViewById(R.id.userChoiceLeonardo);
    final ImageView userChoiceChristian = findViewById(R.id.userChoiceChristian);
    final ImageView userChoiceAl = findViewById(R.id.userChoiceAl);

    int musicAnswer = bundle.getInt("pictureAnswer");

    switch (musicAnswer) {
      case R.id.radioBtnLeonardo:
        userChoiceLeonardo.setVisibility(View.VISIBLE);
        break;
      case R.id.radioBtnChristian:
        userChoiceChristian.setVisibility(View.VISIBLE);
        break;
      case R.id.radioBtnAl:
        userChoiceAl.setVisibility(View.VISIBLE);
        break;
    }

    btnNext.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(PictureResultActivity.this, FilmResultActivity.class);
        intent.putExtras(bundle);
        PictureResultActivity.this.startActivity(intent);
      }
    });
  }
}

