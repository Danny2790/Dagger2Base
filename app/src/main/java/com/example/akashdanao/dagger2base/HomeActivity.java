package com.example.akashdanao.dagger2base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.akashdanao.dagger2base.Component.DaggerImageLoadingComponent;
import com.example.akashdanao.dagger2base.Component.ImageLoadingComponent;
import com.example.akashdanao.dagger2base.Module.ContextModule;
import com.example.akashdanao.dagger2base.Module.PicassoModule;
import com.squareup.picasso.Picasso;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = HomeActivity.class.getSimpleName();
    private Picasso picasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }

    public void init(){

        ImageLoadingComponent daggerImageLoadingComponent = DaggerImageLoadingComponent.builder().contextModule(new ContextModule(this)).build();
        picasso = daggerImageLoadingComponent.getPicasso();
    }
}
