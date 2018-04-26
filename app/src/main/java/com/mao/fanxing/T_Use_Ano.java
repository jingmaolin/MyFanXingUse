package com.mao.fanxing;

import android.util.Pair;

/**
 * Description: 泛型方法
 * author:jingmaolin
 * email:1271799407@qq.com.
 * phone:13342446520.
 * date: 2018/4/26.
 */

public class T_Use_Ano {

    /**
     * 输出最大与最小值
     */
    public <T extends Comparable> Pair<T, T> getMinAndMax(T[] value) {
        T min = value[0];
        T max = value[0];
        for (T v : value) {
            min = min.compareTo(v) > 0 ? v : min;
            max = max.compareTo(v) > 0 ? max : v;
        }
        return new Pair<>(max, min);
    }

}
