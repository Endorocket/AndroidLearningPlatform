package com.example.androidlearningplatform.sections;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidlearningplatform.R;

public class FilmMusicFragment extends Fragment {

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_film_music, container, false);

    final View btnPlayDarkKnightSound = rootView.findViewById(R.id.btnPlayDarkKnightSound);
    final View btnStopDarkKnightSound = rootView.findViewById(R.id.btnStopDarkKnightSound);
    final View btnPlayGladiatorSound = rootView.findViewById(R.id.btnPlayGladiatorSound);
    final View btnStopGladiatorSound = rootView.findViewById(R.id.btnStopGladiatorSound);
    final View btnPlayInterstellarSound = rootView.findViewById(R.id.btnPlayInterstellarSound);
    final View btnStopInterstellarSound = rootView.findViewById(R.id.btnStopInterstellarSound);

    final MediaPlayer mpDarkKnight = MediaPlayer.create(getContext(), R.raw.dark_knight_sound);
    final MediaPlayer mpGladiator = MediaPlayer.create(getContext(), R.raw.gladiator_sound);
    final MediaPlayer mpInterstellar = MediaPlayer.create(getContext(), R.raw.interstellar_music);

    btnPlayDarkKnightSound.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (mpGladiator.isPlaying())
          mpGladiator.pause();

        if (mpInterstellar.isPlaying())
          mpInterstellar.pause();

        if (!mpDarkKnight.isPlaying())
          mpDarkKnight.start();
      }
    });

    btnStopDarkKnightSound.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (mpDarkKnight.isPlaying())
          mpDarkKnight.pause();
      }
    });

    btnPlayGladiatorSound.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (mpDarkKnight.isPlaying())
          mpDarkKnight.pause();

        if (mpInterstellar.isPlaying())
          mpInterstellar.pause();

        if (!mpGladiator.isPlaying())
          mpGladiator.start();
      }
    });

    btnStopGladiatorSound.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (mpGladiator.isPlaying())
          mpGladiator.pause();
      }
    });

    btnPlayInterstellarSound.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (mpDarkKnight.isPlaying())
          mpDarkKnight.pause();

        if (mpGladiator.isPlaying())
          mpGladiator.pause();

        if (!mpInterstellar.isPlaying())
          mpInterstellar.start();
      }
    });

    btnStopInterstellarSound.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (mpInterstellar.isPlaying())
          mpInterstellar.pause();
      }
    });

    return rootView;
  }
}
