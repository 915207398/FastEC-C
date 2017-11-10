package com.ctbu.fastec.example;

import android.app.Application;

import com.ctbu.latte.app.Latte;
import com.ctbu.latte.ec.icon.FontEcModule;
import com.ctbu.latte.net.interceptors.DebugInterceptor;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by chenting on 2017/11/7.
 */

public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://127.0.0.1/")
                .withInterceptor(new DebugInterceptor("index",R.raw.text))
                .configure();
    }
}
