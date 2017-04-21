package com.example.corpit.horoscope2017.Activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.corpit.horoscope2017.Fragment.AquariusFragment;
import com.example.corpit.horoscope2017.Fragment.HomeFragment;
import com.example.corpit.horoscope2017.Fragment.LoveFragment;
import com.example.corpit.horoscope2017.Fragment.LuckyFragment;
import com.example.corpit.horoscope2017.R;

public class HomeActivity extends AppCompatActivity{
    ImageView imHomeicon,imLucky,imLove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        loadFragment(new HomeFragment());
        imHomeicon = (ImageView) findViewById(R.id.imHomeicon);
        imLucky = (ImageView) findViewById(R.id.imLucky);
        imLove =(ImageView) findViewById(R.id.imLove);
        imHomeicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new HomeFragment());
            }
        });
        imLucky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new LuckyFragment());
            }
        });
        imLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new LoveFragment());
            }
        });
    }
    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout, fragment);
        fragmentTransaction.commit();
    }

}
