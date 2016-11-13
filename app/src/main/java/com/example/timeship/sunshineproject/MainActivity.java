package com.example.timeship.sunshineproject;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements ForecastFragment.OnFragmentInteractionListener {
ForecastFragment forecastFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forecastFragment = ForecastFragment.newInstance("hello", "world");
        getSupportFragmentManager().beginTransaction()
                .add(R.id.activity_main, forecastFragment).commit();


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
