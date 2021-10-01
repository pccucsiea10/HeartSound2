package com.example.heartsound;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class StartDepartment4 extends Fragment {

    private View mainView;
    private Button back_department_start,back_vedio;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        mainView = inflater.inflate(R.layout.start_department4,container,false);

        back_department_start = mainView.findViewById(R.id.back_department_start);
        back_vedio = mainView.findViewById(R.id.back_vedio);

        back_department_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,new StartFragment()).commit();
            }
        });

        back_vedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,new StartDepartment3()).commit();
            }
        });

        return mainView;
    }
}

