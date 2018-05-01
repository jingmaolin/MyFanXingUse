package com.mao.fanxing;

/**
 * Description:通配符中上界extends的使用，不可调用 方法中参数类型为T及其子类，其他可调用
 * author:jingmaolin
 * email:1271799407@qq.com.
 * phone:13342446520.
 * date: 2018/5/1.
 */

public class _Use<T> {
    private T first;
    private T Second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return Second;
    }

    public void setSecond(T second) {
        Second = second;
    }

    public void haha(T a){

    }

    public void hehe(String d){

    }

    public T getvalue(){
        return first;
    }
}
