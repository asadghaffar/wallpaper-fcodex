package com.asad.wallpaper.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.asad.wallpaper.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class DownloadImage extends AppCompatActivity {

    private MaterialButton materialButton;
    private LinearLayout linearLayout;
    private MaterialTextView materialTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_image);

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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        linearLayout.setVisibility(View.INVISIBLE);
    }

    private void onClick() {
        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.VISIBLE);
            }
        });

        materialTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.INVISIBLE);
            }
        });

    }

    private void id() {
        materialTextView = findViewById(R.id.back);
        linearLayout = findViewById(R.id.nextLinear);
        materialButton = findViewById(R.id.next_button1);
    }
}