package com.ctbu.fastec.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ctbu.latte.activities.ProxyActivity;
import com.ctbu.latte.app.Latte;
import com.ctbu.latte.delegates.LatteDelegate;
import com.ctbu.latte.ec.icon.FontEcModule;
import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.FontAwesomeModule;


public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }

}
