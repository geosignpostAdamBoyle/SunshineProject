package com.example.timeship.sunshineproject;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {
BlankFragment blankFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blankFragment = BlankFragment.newInstance("hello", "world");
        getSupportFragmentManager().beginTransaction()
                .add(R.id.activity_main, blankFragment).commit();


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
