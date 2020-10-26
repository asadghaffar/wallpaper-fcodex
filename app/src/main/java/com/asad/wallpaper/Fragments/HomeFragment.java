package com.asad.wallpaper.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.asad.wallpaper.Activities.DownloadImage;
import com.asad.wallpaper.Activities.HomeImageView;
import com.asad.wallpaper.R;


public class HomeFragment extends Fragment {

    private View view;
    private ImageView allImageShow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

        id();
        onClick();

        return view;
    }

    private void onClick() {
        allImageShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), DownloadImage.class);
                startActivity(intent);
            }
        });
    }

    private void id() {
        allImageShow = view.findViewById(R.id.allImageShow);
    }
}