package com.ctbu.fastec.example;

import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ctbu.latte.activities.ProxyActivity;
import com.ctbu.latte.app.Latte;
import com.ctbu.latte.delegates.LatteDelegate;
import com.ctbu.latte.ec.icon.FontEcModule;
import com.ctbu.latte.ec.launcher.LauncherDelegate;
import com.ctbu.latte.ec.launcher.LauncherScrollDelegate;
import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.FontAwesomeModule;


public class ExampleActivity extends ProxyActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherDelegate();
    }

}
