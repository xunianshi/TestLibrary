package com.wait.mytestlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MyBaseActivity extends AppCompatActivity {

    private static final String TAG = "MyBaseActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate: hello it's me ");
    }
}
