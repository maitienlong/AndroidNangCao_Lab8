package com.example.lab8;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.Toast;

public class MusicActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    ImageView cdi;
    Animator cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        mediaPlayer = MediaPlayer.create(this, R.raw.crazy);
        cdi = findViewById(R.id.cd);

        cd = AnimatorInflater.loadAnimator(MusicActivity.this, R.animator.diaquay);
        cd.setTarget(cdi);
        cd.setInterpolator(new LinearInterpolator());
    }

    public void btnPlay(View view) {
        if (mediaPlayer.isPlaying()) {
            Toast.makeText(this, "BÀI HÁT ĐANG PHÁT", Toast.LENGTH_SHORT).show();
        } else {


                mediaPlayer.start();

            cd.start();
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void btnPause(View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            cd.pause();
        } else {
            Toast.makeText(this, "BÀI HÁT ĐANG TẠM DỪNG", Toast.LENGTH_SHORT).show();
        }
    }

    public void btnStop(View view) {

//        if (mediaPlayer.isPlaying()) {
//            try {
//                mediaPlayer.stop();
//                mediaPlayer.release();
//                mediaPlayer.reset();
//
//            } catch (Exception e) {
//                Toast.makeText(this, e + "", Toast.LENGTH_SHORT).show();
//            }
//
//
//        } else {
//            Toast.makeText(this, "BÀI HÁT ĐANG ĐÃ DỪNG", Toast.LENGTH_SHORT).show();
//        }


    }
}
