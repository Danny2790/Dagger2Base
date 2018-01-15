package com.example.akashdanao.dagger2base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    private Picasso picasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void InitBeforeDagger(){


        //Picasso dependency on
        // 1. okHttpClient
        // 2. OkhttpDownloader

        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .build();

        OkHttp3Downloader okHttpDownloader = new OkHttp3Downloader(okHttpClient);


        picasso = new Picasso.Builder(this).downloader(okHttpDownloader).build();
    }
}
