package com.example.akashdanao.dagger2base;

import android.app.Application;

import com.example.akashdanao.dagger2base.Component.DaggerImageLoadingComponent;
import com.example.akashdanao.dagger2base.Component.ImageLoadingComponent;
import com.example.akashdanao.dagger2base.Module.ContextModule;

/**
 * Created by akash.danao on 16/01/18.
 */

public class MyApplication extends Application {

    public static MyApplication mInstance;

    public ImageLoadingComponent imageLoadingComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        initAppComponent();
    }

    public static MyApplication getInstance(){
        return mInstance;
    }

    private void initAppComponent() {
        imageLoadingComponent = DaggerImageLoadingComponent.builder().contextModule(new ContextModule(this)).build();
    }

    public ImageLoadingComponent getComponent(){
        return imageLoadingComponent;
    }
}
