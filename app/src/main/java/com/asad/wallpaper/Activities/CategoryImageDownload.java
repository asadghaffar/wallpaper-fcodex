package com.asad.wallpaper.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.asad.wallpaper.R;

public class CategoryImageDownload extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_image_download);

        id();
        onClick();
        fullScreen();

    }

    private void fullScreen() {
        if (getSupportActionBar() != null)
            getSupportActionBar().hide();
        // to make status bar transparent
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

    private void onClick() {

    }

    private void id() {

    }
}