package com.mao.fanxing;

import android.util.Log;

import java.lang.reflect.Array;

/**
 * Description:类型变量数组使用,不可直接用类型变量初始化数组
 * author:jingmaolin
 * email:1271799407@qq.com.
 * phone:13342446520.
 * date: 2018/5/1.
 */

public class T_Use_Four<E> {
    private E[] value;

    public T_Use_Four() {
//        value = new E[10];//Error doing
    }

    public E getValue(int n) {
        return this.value[n];
    }

    public void setValue(int n, E value) {
        Log.d("hahamaolin", "setValue: " + value.getClass());
        this.value = (E[]) Array.newInstance(value.getClass(), 10);
        this.value[n] = value;
    }
}
