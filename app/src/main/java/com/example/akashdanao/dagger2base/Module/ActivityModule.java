package com.example.akashdanao.dagger2base.Module;

import android.app.Activity;
import android.content.Context;

import com.example.akashdanao.dagger2base.Interfaces.ApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by akash.danao on 15/01/18.
 */

@Module
public class ActivityModule {

    private final Context context;

    ActivityModule(Activity context){
        this.context = context;
    }


    @Provides
    public Context context(){ return  context; }
}
