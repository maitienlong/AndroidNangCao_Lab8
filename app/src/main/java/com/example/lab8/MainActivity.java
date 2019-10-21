package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void musicplayer(View view) {
        Intent intent = new Intent(this, MusicActivity.class);
        startActivity(intent);
    }

    public void takeaphoto(View view) {
        Intent intent = new Intent(this, TakeAPhotoActivity.class);
        startActivity(intent);
    }
}
