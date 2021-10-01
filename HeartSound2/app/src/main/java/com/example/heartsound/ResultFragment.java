package com.example.heartsound;

//import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class ResultFragment extends Fragment {

    private View mainView;
    private TextView tital_list;
    private Button choose1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        mainView = inflater.inflate(R.layout.list_department,container,false);

        tital_list = mainView.findViewById(R.id.tital_list);
        tital_list.setText("結果分析 - 科系列表");

        choose1 = mainView.findViewById(R.id.choose1);
        choose1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragment_container,new ResultDepartment()).commit();
            }
        });

        return mainView;
    }
}
