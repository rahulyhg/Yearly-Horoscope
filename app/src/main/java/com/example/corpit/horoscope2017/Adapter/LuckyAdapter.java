package com.example.corpit.horoscope2017.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.corpit.horoscope2017.Entity.LuckyPet;
import com.example.corpit.horoscope2017.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Corp IT on 17/4/2017.
 */

public class LuckyAdapter extends BaseAdapter {
    Context context;
    List<LuckyPet> petList;
    LayoutInflater layoutInflater;
    ImageView image;
    TextView tvHoroscope,tvPetName;


    public LuckyAdapter(Context context, List<LuckyPet> petList){
        this.context =context;
        this.petList =petList;
        layoutInflater=layoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return petList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView=layoutInflater.inflate(R.layout.activity_luckypet_item,null);
        image =(ImageView)convertView.findViewById(R.id.image);
        tvHoroscope = (TextView) convertView.findViewById(R.id.tvHoroscope);
        tvPetName = (TextView)convertView.findViewById(R.id.tvPetName);
        image.setImageResource(petList.get(position).getPets());
        tvHoroscope.setText(petList.get(position).getHoroscope());
        tvPetName.setText(petList.get(position).getPetName());
        return convertView;
    }
}
