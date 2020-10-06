package com.asad.wallpaper.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.asad.wallpaper.Activities.CategoryImageShow;
import com.asad.wallpaper.R;

public class CategoryFragment extends Fragment {

    private CardView categoryCardView;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_category, container, false);

        id();
        onClick();

        return view;
    }

    private void id() {
        categoryCardView = view.findViewById(R.id.categoryCardView);
    }

    private void onClick() {
        categoryCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryImageShow.class);
                startActivity(intent);
            }
        });
    }
}