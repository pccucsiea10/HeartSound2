package com.example.heartsound;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class StartDepartment extends Fragment {

    private View mainView;
    private TextView tital;
    private Button normal_start;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        mainView = inflater.inflate(R.layout.start_normal,container,false);

        tital = mainView.findViewById(R.id.tital_startnormal);
        tital.setText("依科系 - 測量");

        normal_start = mainView.findViewById(R.id.normal_start);

        normal_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,new StartDepartment2()).commit();
            }
        });

        return mainView;
    }
}

