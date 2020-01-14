package com.example.androidlearningplatform.results;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.androidlearningplatform.MainActivity;
import com.example.androidlearningplatform.R;

public class FilmResultActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_film_result);

    Intent intent = getIntent();
    final Bundle bundle = intent.getExtras();

    final View btnNext = findViewById(R.id.btnFilmResultNext);
    final ImageView userChoiceLord = findViewById(R.id.userChoiceLord);
    final ImageView userChoiceHobbit = findViewById(R.id.userChoiceHobbit);
    final ImageView userChoiceIrish = findViewById(R.id.userChoiceIrish);

    int musicAnswer = bundle.getInt("filmAnswer");

    switch (musicAnswer) {
      case R.id.radioBtnLord:
        userChoiceLord.setVisibility(View.VISIBLE);
        break;
      case R.id.radioBtnHobbit:
        userChoiceHobbit.setVisibility(View.VISIBLE);
        break;
      case R.id.radioBtnIrish:
        userChoiceIrish.setVisibility(View.VISIBLE);
        break;
    }

    btnNext.setOnClickListener(v -> {
      Intent intent1 = new Intent(FilmResultActivity.this, MainActivity.class);
      FilmResultActivity.this.startActivity(intent1);
    });
  }
}

