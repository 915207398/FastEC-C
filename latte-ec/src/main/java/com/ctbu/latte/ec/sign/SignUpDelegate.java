package com.ctbu.latte.ec.sign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.ctbu.latte.delegates.LatteDelegate;
import com.ctbu.latte.ec.R;

/**
 * Created by chenting on 2017/11/12.
 */

public class SignUpDelegate extends LatteDelegate{
    @Override
    public Object setLayout() {
        return R.layout.delegate_sign_up;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        super.onBindView(savedInstanceState, rootView);
    }
}
