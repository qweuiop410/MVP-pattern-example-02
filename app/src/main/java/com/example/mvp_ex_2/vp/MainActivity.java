package com.example.mvp_ex_2.vp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mvp_ex_2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout, new MainFragment())
                .commit();

    }
}
