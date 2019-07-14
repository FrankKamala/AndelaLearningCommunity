package com.example.andelalearningcommunity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAbout(View view) {
        Intent intent=new Intent(this,about.class);
        startActivity(intent);

    }

    public void btnProfile(View view) {
        Intent intent=new Intent(this,profile.class);
        startActivity(intent);
    }
}
