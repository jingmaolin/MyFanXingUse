package com.mao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.mao.fanxing.T_Use;

/**
 * 泛型的使用
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T_Use<String> a = new T_Use<>();
        a.sum("123");
        Log.d(TAG, "onCreate: " + a.getValue());

        T_Use<Integer> b=new T_Use<Integer>();
        b.sum(456);
        Log.d(TAG, "onCreate: "+b.getValue());

        T_Use<TestBean> c=new T_Use();
        c.sum(new TestBean(12, "22", "33"));
        Log.d(TAG, "onCreate: "+c.getValue().getName());
    }
}
