package com.example.akashdanao.dagger2base.Component;

import com.example.akashdanao.dagger2base.Interfaces.ApplicationScope;
import com.example.akashdanao.dagger2base.Module.PicassoModule;
import com.squareup.picasso.Picasso;

import dagger.Component;

/**
 * Created by akash.danao on 15/01/18.
 */

@ApplicationScope
@Component(modules = {PicassoModule.class})
public interface ImageLoadingComponent {

    Picasso getPicasso();
}
