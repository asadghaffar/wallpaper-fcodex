package com.asad.wallpaper.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.asad.wallpaper.R;

public class HomeImageView extends AppCompatActivity {

    private CardView homeAllImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_image_view);

        id();
        onClick();

    }

    private void id() {
        homeAllImageView = findViewById(R.id.homeAllImageView);
    }

    private void onClick() {
        homeAllImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeImageView.this, DownloadImage.class);
                startActivity(intent);

            }
        });
    }
}