package com.mao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Pair;

import com.mao.fanxing.T_Use;
import com.mao.fanxing.T_Use_Ano;
import com.mao.fanxing.T_Use_Three;

/**
 * 泛型的使用
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t_use_three();
    }

    /**
     * T_USE
     */
    private void t_use() {
        T_Use<String> a = new T_Use<>();
        a.sum("123");
        Log.d(TAG, "onCreate: " + a.getValue());

        T_Use<Integer> b = new T_Use<Integer>();
        b.sum(456);
        Log.d(TAG, "onCreate: " + b.getValue());

        T_Use<TestBean> c = new T_Use();
        c.sum(new TestBean(12, "22", "33"));
        Log.d(TAG, "onCreate: " + c.getValue().getName());
    }

    /**
     * T_Use_Ano
     */
    private void t_use_ano() {
        TestBean[] testBeans = new TestBean[]{new TestBean(12, "小明", "希望小学"),
                new TestBean(2, "小红", "希望幼儿园"),
                new TestBean(22, "小光", "希望中学")};
        Pair<TestBean, TestBean> pair = new T_Use_Ano().<TestBean>getMinAndMax(testBeans);
        Log.d(TAG, "t_use_ano: " + "max=" + pair.first.getName() + ";" + "min=" + pair.second.getName());
    }

    /**
     * T_Use_Three
     */
    private void t_use_three() {
        T_Use_Three t_use_three = new T_Use_Three(new TestBean(), new TestBean());
        Pair<TestBean, TestBean> pair = t_use_three;    //类型擦除地方
        pair.equals(new T_Use_Three(new TestBean(), new TestBean()));//断点跟踪调用的方法
    }
}
