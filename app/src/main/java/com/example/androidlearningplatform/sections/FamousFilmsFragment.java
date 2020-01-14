package com.example.androidlearningplatform.sections;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

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
    View rootView = inflater.inflate(R.layout.fragment_famous_films, container, false);

    final View testButton = rootView.findViewById(R.id.test_button);

    final View btnPlayHobbitTrailer = rootView.findViewById(R.id.btnPlayHobbitTrailer);
    final View btnStopHobbitTrailer = rootView.findViewById(R.id.btnStopHobbitTrailer);
    final View btnPlayLordTrailer = rootView.findViewById(R.id.btnPlayLordTrailer);
    final View btnStopLordTrailer = rootView.findViewById(R.id.btnStopLordTrailer);
    final View btnPlayIrishTrailer = rootView.findViewById(R.id.btnPlayIrishTrailer);
    final View btnStopIrishTrailer = rootView.findViewById(R.id.btnStopIrishTrailer);

    final VideoView videoHobbitTrailer = rootView.findViewById(R.id.videoHobbitTrailer);
    final VideoView videoLordTrailer = rootView.findViewById(R.id.videoLordTrailer);
    final VideoView videoIrishTrailer = rootView.findViewById(R.id.videoIrishTrailer);

    String path;
    Uri uri;

    MediaController mcHobbit = new MediaController(getContext());
    videoHobbitTrailer.setMediaController(mcHobbit);
    path = "android.resource://com.example.androidlearningplatform/" + R.raw.hobbit_trailer;
    uri = Uri.parse(path);
    videoHobbitTrailer.setVideoURI(uri);

    MediaController mcLord = new MediaController(getContext());
    videoLordTrailer.setMediaController(mcLord);
    path = "android.resource://com.example.androidlearningplatform/" + R.raw.lord_of_rings;
    uri = Uri.parse(path);
    videoLordTrailer.setVideoURI(uri);

    MediaController mcIrish = new MediaController(getContext());
    videoIrishTrailer.setMediaController(mcIrish);
    path = "android.resource://com.example.androidlearningplatform/" + R.raw.irish_trailer;
    uri = Uri.parse(path);
    videoIrishTrailer.setVideoURI(uri);

    btnPlayHobbitTrailer.setOnClickListener(v -> videoHobbitTrailer.start());
    btnStopHobbitTrailer.setOnClickListener(v -> videoHobbitTrailer.pause());

    btnPlayLordTrailer.setOnClickListener(v -> videoLordTrailer.start());
    btnStopLordTrailer.setOnClickListener(v -> videoLordTrailer.pause());

    btnPlayIrishTrailer.setOnClickListener(v -> videoIrishTrailer.start());
    btnStopIrishTrailer.setOnClickListener(v -> videoIrishTrailer.pause());

    testButton.setOnClickListener(v -> {
      Intent intent = new Intent(getActivity(), MusicTaskActivity.class);
      Objects.requireNonNull(getActivity()).startActivity(intent);
    });

    return rootView;
  }
}
