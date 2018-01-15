package com.example.akashdanao.dagger2base.Module;

import android.content.Context;


import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by akash.danao on 15/01/18.
 */

@Module(includes = {OkhttpClientModule.class, ContextModule.class})
public class PicassoModule {

    @Provides
    public Picasso picasso(Context context, OkHttp3Downloader okHttp3Downloader){
        return new Picasso.Builder(context).
                downloader(okHttp3Downloader).
                build();
    }

    @Provides
    public OkHttp3Downloader okHttpDownloader(OkHttpClient okHttpClient){
        return new OkHttp3Downloader(okHttpClient);

    }

}
