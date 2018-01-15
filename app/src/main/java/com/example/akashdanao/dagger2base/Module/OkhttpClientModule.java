package com.example.akashdanao.dagger2base.Module;


import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by akash.danao on 15/01/18.
 */

@Module
public class OkhttpClientModule {

    @Provides
    public OkHttpClient okHttpClient(){
        return  new OkHttpClient().newBuilder().build();
    }
}
