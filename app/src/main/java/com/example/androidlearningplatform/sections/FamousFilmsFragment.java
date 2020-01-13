package com.example.androidlearningplatform.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidlearningplatform.R;
import com.example.androidlearningplatform.tasks.MusicTaskActivity;

import java.util.Objects;

public class FamousFilmsFragment extends Fragment {

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_famous_films, container, false);

    View testButton = view.findViewById(R.id.test_button);
    testButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(getActivity(), MusicTaskActivity.class);
        Objects.requireNonNull(getActivity()).startActivity(intent);
      }
    });


    return view;
  }


}
