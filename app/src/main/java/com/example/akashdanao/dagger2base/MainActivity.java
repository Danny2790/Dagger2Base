package com.example.akashdanao.dagger2base;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.akashdanao.dagger2base.Component.DaggerImageLoadingComponent;
import com.example.akashdanao.dagger2base.Component.ImageLoadingComponent;
import com.example.akashdanao.dagger2base.Module.ContextModule;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Picasso picasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_launch_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, HomeActivity.class));
            }
        });
        initAfterDagger();
    }


    public void initAfterDagger(){

        ImageLoadingComponent daggerImageLoadingComponent = DaggerImageLoadingComponent.builder().contextModule(new ContextModule(this)).build();
        picasso = daggerImageLoadingComponent.getPicasso();
        Log.d(TAG, "initAfterDagger: picasso " + picasso.toString());
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
