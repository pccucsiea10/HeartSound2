package com.example.heartsound;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {

    BottomNavigationView bottomNav;
    Context context;
//    private FragmentManager fragmentMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        PersonFragment fragment2 = new PersonFragment();
//        FragmentManager fragmentManager= getFragmentManager();
//        FragmentTransaction transaction=fragmentManager.beginTransaction();
//        transaction.add(R.id.fragment_container, fragment2);
//
//        transaction.addToBackStack(null);
//        transaction.commit();
//        fragmentMgr = getFragmentManager();

        context = this;
        new FullScreenDialog(context).show();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new PersonFragment()).commit();

        bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch(item.getItemId()){
                        case R.id.person:
                            selectedFragment = new PersonFragment();
                            break;
                        case R.id.teaching:
                            selectedFragment = new TeachingFragment();
                            break;
                        case R.id.start:
                            selectedFragment = new StartFragment();
                            break;
                        case R.id.result:
                            selectedFragment = new ResultFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };
}