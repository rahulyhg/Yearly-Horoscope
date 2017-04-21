package com.example.corpit.horoscope2017.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.corpit.horoscope2017.Adapter.LuckyAdapter;
import com.example.corpit.horoscope2017.Entity.LuckyPet;
import com.example.corpit.horoscope2017.R;

import java.util.ArrayList;
import java.util.List;


public class LuckyFragment extends Fragment {
    View view;
    ListView listView;
    List<LuckyPet> petList=new ArrayList<>();
    String horoscope[]={"Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittaurus","Capricorn","Aquarius","Pisces"};
    int pets[]={R.drawable.ariespet,R.drawable.tauruspet,R.drawable.geminipet,R.drawable.cancerpet,R.drawable.leopet,R.drawable.virgopet,
    R.drawable.librapet,R.drawable.scorpiopet,R.drawable.sagittauruspet,R.drawable.carpricornpet,R.drawable.aquariuspet,R.drawable.piscespet};
    String petName[]={"Labrador Dog","Orange Cat","Parrot","Hamster","Horse","Gold Fish","Angelic Fish","Snake","Tortoise","Guinea Pig",
            "Love Birds","Rabbit"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.activity_luckypet,container,false);
        listView =(ListView)view.findViewById(R.id.simplelistview);
        LuckyAdapter adapter = new LuckyAdapter(getActivity(),petList);
        listView.setAdapter(adapter);
        updateTopetList();

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    private void updateTopetList(){
        for(int i =0;i<horoscope.length;i++){
            LuckyPet pet = new LuckyPet(horoscope[i],pets[i],petName[i]);
            petList.add(pet);
        }
    }
}
