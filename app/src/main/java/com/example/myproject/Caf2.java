package com.example.myproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dinuscxj.progressbar.CircleProgressBar;
import com.example.myproject.databinding.FragmentCaf1Binding;
import com.example.myproject.databinding.FragmentCaf2Binding;


/**
 * A simple {@link Fragment} subclass.
 */
public class Caf2 extends Fragment {

    public Caf2() {
        // Required empty public constructor
    }
    CircleProgressBar circleProgressBar;

    FragmentCaf2Binding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCaf2Binding.inflate(inflater, container, false);
        circleProgressBar=binding.cpbCirclebar2;
        circleProgressBar.setProgress(30);  // 해당 퍼센트를 적용

        //return inflater.inflate(R.layout.fragment_caf1, container, false);
        return binding.getRoot();
    }
}
