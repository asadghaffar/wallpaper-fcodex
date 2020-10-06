package com.asad.wallpaper.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.asad.wallpaper.R;

public class CategoryImageShow extends AppCompatActivity {

    private CardView categoryImageShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_image_show);

        id();
        onClick();

    }

    private void onClick() {
        categoryImageShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryImageShow.this, CategoryImageDownload.class);
                startActivity(intent);

            }
        });
    }

    private void id() {
        categoryImageShow = findViewById(R.id.categoryImageShow);
    }
}