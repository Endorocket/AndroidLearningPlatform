package com.example.androidlearningplatform;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.androidlearningplatform.sections.FamousActorsFragment;
import com.example.androidlearningplatform.sections.FamousFilmsFragment;
import com.example.androidlearningplatform.sections.FilmMusicFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends FragmentActivity {

  private static final int NUM_PAGES = 3;

  private ViewPager viewPager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    viewPager = findViewById(R.id.pager);
    PagerAdapter pagerAdapter = new SectionsTabsPagerAdapter(getSupportFragmentManager());
    viewPager.setAdapter(pagerAdapter);

    TabLayout tabLayout = findViewById(R.id.sections_tab_layout);
    tabLayout.setupWithViewPager(viewPager);
  }

  @Override
  public void onBackPressed() {
    if (viewPager.getCurrentItem() == 0) {
      super.onBackPressed();
    } else {
      viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
    }
  }

  private class SectionsTabsPagerAdapter extends FragmentStatePagerAdapter {

    SectionsTabsPagerAdapter(FragmentManager fm) {
      super(fm);
    }

    @Override
    public Fragment getItem(int position) {
      switch (position) {
        case 0:
          return new FilmMusicFragment();
        case 1:
          return new FamousActorsFragment();
        case 2:
          return new FamousFilmsFragment();
        default:
          return null;
      }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
      switch (position) {
        case 0:
          return "Muzyka\nfilmowa";
        case 1:
          return "Znani\naktorzy";
        case 2:
          return "Znane\nfilmy";
        default:
          return null;
      }
    }

    @Override
    public int getCount() {
      return NUM_PAGES;
    }
  }
}
