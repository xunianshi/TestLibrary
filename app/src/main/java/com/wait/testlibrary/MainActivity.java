package com.wait.testlibrary;

import android.os.Bundle;

import com.wait.mytestlibrary.MyBaseActivity;
import com.wait.mytestlibrary.MyUtils;

public class MainActivity extends MyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyUtils.log("ok");
    }
}
