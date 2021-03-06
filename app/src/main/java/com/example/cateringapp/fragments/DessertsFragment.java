package com.example.cateringapp.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cateringapp.R;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class DessertsFragment extends Fragment {

    public DessertsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_desserts, container, false);

        Objects.requireNonNull(getActivity()).setTitle(R.string.desserts);

        return view;
    }
}
