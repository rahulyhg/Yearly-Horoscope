package com.example.corpit.horoscope2017.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.corpit.horoscope2017.Adapter.LoveAdapter;
import com.example.corpit.horoscope2017.Entity.Love;
import com.example.corpit.horoscope2017.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Corp IT on 19/4/2017.
 */

public class LoveFragment extends Fragment {
    Spinner spOne;
    private int spinnerImage[]={R.drawable.ariespet};
    private String spinnerText[]={"Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittaurus","Capricorn","Aquarius","Pisces"};
    List<Love> spinnerList=new ArrayList<>();
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.activity_love,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        spOne =(Spinner)view.findViewById(R.id.spOne);
       // spTwo=(Spinner)view.findViewById(R.id.spTwo);
        LoveAdapter adapter = new LoveAdapter(getActivity(),spinnerList);
        spOne.setAdapter(adapter);
        //spTwo.setAdapter(adapter);
        updateToSpinner();
        spOne.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    private void updateToSpinner(){
        for(int i=0;i<spinnerImage.length;i++){
            Love b = new Love(spinnerText[i],spinnerImage[i]);
            spinnerList.add(b);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
