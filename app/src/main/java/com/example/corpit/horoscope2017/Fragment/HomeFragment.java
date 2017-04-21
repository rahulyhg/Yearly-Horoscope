package com.example.corpit.horoscope2017.Fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.corpit.horoscope2017.R;

/**
 * Created by Corp IT on 3/4/2017.
 */

public class HomeFragment extends Fragment{
    private ImageView imAquarius,imCarpricon,imLeo,imSagittaurus,imVirgo,imAries,imScorpio,imCancer,imGemini,
            imPisces,imLibra,imTaurus;
    private View view;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.activity_fragment_home,container,false);
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
    private void initView(){
        imAquarius = (ImageView)view.findViewById(R.id.imAquarius);
        imCarpricon = (ImageView)view.findViewById(R.id.imCapricorn);
        imLeo =(ImageView)view.findViewById(R.id.imLeo);
        imSagittaurus = (ImageView)view.findViewById(R.id.imSagittaurus);
        imVirgo = (ImageView)view.findViewById(R.id.imVirgo);
        imAries = (ImageView) view.findViewById(R.id.imAries);
        imScorpio = (ImageView)view.findViewById(R.id.imScorpio);
        imCancer = (ImageView)view.findViewById(R.id.imCancer);
        imGemini = (ImageView)view.findViewById(R.id.imGemini);
        imPisces = (ImageView)view.findViewById(R.id.imPisces);
        imLibra = (ImageView)view.findViewById(R.id.imLibra);
        imTaurus = (ImageView)view.findViewById(R.id.imTaurus);
        imAquarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new AquariusFragment());
            }
        });
        imCancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new CancerFragment());
            }
        });
        imAries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new AriesFragment());
            }
        });
        imCarpricon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new CapricornFragment());
            }
        });
        imGemini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new GeminiFragment());
            }
        });
        imLeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new LeoFragment());
            }
        });
        imLibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new LibraFragment());
            }
        });
        imPisces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new PiscesFragment());
            }
        });
        imSagittaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new SagittaurusFragment());
            }
        });
        imScorpio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new ScorpioFragment());
            }
        });
        imTaurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new TaurusFragment());
            }
        });
        imVirgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new VirgoFragment());
            }
        });

    }
    private void loadFragment(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();
    }
}
