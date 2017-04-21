package com.example.corpit.horoscope2017.Adapter;

import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.corpit.horoscope2017.Entity.Love;
import com.example.corpit.horoscope2017.R;

import java.util.List;

/**
 * Created by Corp IT on 20/4/2017.
 */

public class LoveAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    List<Love> spinnerList;
   ImageView image;
    TextView tvHoroscope;

    public LoveAdapter(Context context,List<Love> spinnerList){
        this.spinnerList =spinnerList;
        layoutInflater = layoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return spinnerList.size();
    }

    @Override
    public Object getItem(int position) {
        return spinnerList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.activity_loveitem,null);
        image =(ImageView)convertView.findViewById(R.id.image);
        tvHoroscope = (TextView) convertView.findViewById(R.id.tvHoroscope);
        image.setImageResource(spinnerList.get(position).getSpinnerImage());
        tvHoroscope.setText(spinnerList.get(position).getSpinnerText());
        return convertView;
    }
}
