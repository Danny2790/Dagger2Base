package com.example.akashdanao.dagger2base.Module;


import com.example.akashdanao.dagger2base.Interfaces.ApplicationScope;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by akash.danao on 15/01/18.
 */

@Module
public class OkhttpClientModule {

    @ApplicationScope
    @Provides
    public OkHttpClient okHttpClient(){
        return  new OkHttpClient().newBuilder().build();
    }
}
