package com.example.akashdanao.dagger2base.Module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by akash.danao on 15/01/18.
 */

@Module
public class ContextModule {

    private Context context;

    public ContextModule(Context context){
        this.context = context;
    }

    @Provides
    public Context context(){
        return this.context.getApplicationContext();
    }
}
