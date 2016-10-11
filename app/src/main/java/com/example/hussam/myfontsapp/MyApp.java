package com.example.hussam.myfontsapp;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Hussam on 10/11/2016.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("jf.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

    }
}
