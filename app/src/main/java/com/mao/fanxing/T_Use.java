package com.mao.fanxing;

import android.util.Log;

/**
 * Description ：泛型类
 * Created by jingmaolin on 2018/4/25.
 * Job number：600029
 * Phone ：13342446520
 * Email：jingmaolin@syswin.com
 * Person in charge ： jingmaolin
 * Leader：wangyue
 */

public class T_Use<T> {
    private static final String TAG = "T_Use";
    private T value;

    public void sum(T value) {
        this.value=value;
        Log.d(TAG, "sum: " + this.value);
    }

    public T getValue() {
        return value;
    }
}
