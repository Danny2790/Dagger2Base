package com.example.akashdanao.dagger2base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.akashdanao.dagger2base.Component.ApiComponent;
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

        ApiComponent daggerApiComponent = MyApplication.getInstance().getComponent();
        picasso = daggerApiComponent.getPicasso();

    }
}
