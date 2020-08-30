package com.example.myproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dinuscxj.progressbar.CircleProgressBar;
import com.example.myproject.databinding.FragmentCaf1Binding;


/**
 * A simple {@link Fragment} subclass.
 */
public class Caf1 extends Fragment {

    public Caf1() {
        // Required empty public constructor
    }

    private static final String DEFAULT_PATTERN = "%d%%";
    CircleProgressBar circleProgressBar1;

    FragmentCaf1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentCaf1Binding.inflate(inflater, container, false);
        circleProgressBar1=binding.cpbCirclebar1;
        circleProgressBar1.setProgress(85);  // 해당 퍼센트를 적용

        //return inflater.inflate(R.layout.fragment_caf1, container, false);
        return binding.getRoot();
    }
}
