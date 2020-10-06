package com.asad.wallpaper.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.asad.wallpaper.R;

public class SplashScreen extends AppCompatActivity {

    private ProgressBar splashProgress;
    private int SPLASH_TIME = 5000; //This is 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        id();
        fullScreen();
        playProgress();
        progressMethod();

    }

    private void fullScreen() {
        if (getSupportActionBar() != null)
            getSupportActionBar().hide();
        // to make status bar transparent
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

    private void progressMethod() {
        //Code to start timer and take action after the timer ends
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do any action here. Now we are moving to next page
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                //This 'finish()' is for exiting the app when back button pressed from HomeFragment page which is ActivityHome
                finish();
            }
        }, SPLASH_TIME);
    }

    private void id() {
        splashProgress = findViewById(R.id.splashProgress);
    }

    //Method to run progress bar for 5 seconds
    private void playProgress() {
        ObjectAnimator.ofInt(splashProgress, "Progress", 100)
                .setDuration(5000)
                .start();
    }
}