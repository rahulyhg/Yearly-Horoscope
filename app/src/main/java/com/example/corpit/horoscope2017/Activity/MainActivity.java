package com.example.corpit.horoscope2017.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.corpit.horoscope2017.R;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progressStatus = 0;
    private TextView tvResult;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.simpleProgressBar);
        tvResult = (TextView) findViewById(R.id.tvResult);
        setProgressBar();


    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Intent i = new Intent(MainActivity.this,HomeActivity.class);
        startActivity(i);
    }

    private void setProgressBar() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (progressStatus == 100) {
                    progressStatus = 0;
                }
                while (progressStatus < 100) {
                    progressStatus = progressStatus + 5;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progressStatus);
                            tvResult.setText("Loading... " + progressStatus + "%");
                            goToHomeActivity(progressStatus);
                        }
                    });
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();


    }

    private void goToHomeActivity(int progress) {
        if (progress == 100) {
            Intent i = new Intent(MainActivity.this, HomeActivity.class);
            startActivityForResult(i, 9);
        }
    }
}