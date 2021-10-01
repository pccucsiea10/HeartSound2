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

public class StartDepartment2 extends Fragment {

    private View mainView;
    private TextView tital;
    private Button choose1,choose2,choose3,choose4,choose5,choose6,choose7,choose8,choose9,choose10;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        mainView = inflater.inflate(R.layout.list_department,container,false);


        choose1 = mainView.findViewById(R.id.choose1);
        choose2 = mainView.findViewById(R.id.choose2);
        choose3 = mainView.findViewById(R.id.choose3);
        choose4 = mainView.findViewById(R.id.choose4);
        choose5 = mainView.findViewById(R.id.choose5);
        choose6 = mainView.findViewById(R.id.choose6);
        choose7 = mainView.findViewById(R.id.choose7);
        choose8 = mainView.findViewById(R.id.choose8);
        choose9 = mainView.findViewById(R.id.choose9);
        choose10 = mainView.findViewById(R.id.choose10);

        choose1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,new StartDepartment3()).commit();
            }
        });

        return mainView;
    }
}
