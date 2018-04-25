package com.mao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 泛型的使用
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new T_Use<String>().sum("haha");
        new T_Use<Integer>().sum(13);
        new T_Use().sum(new TestBean(12,"22","33"));
    }
}
