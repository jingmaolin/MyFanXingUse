package com.mao.fanxing;

import android.util.Pair;

import com.mao.TestBean;

/**
 * Description ：类型擦除
 * Created by jingmaolin on 2018/4/27.
 * Job number：600029
 * Phone ：13342446520
 * Email：jingmaolin@syswin.com
 * Person in charge ： jingmaolin
 * Leader：wangyue
 */

public class T_Use_Three extends Pair<TestBean, TestBean> {
    /**
     * Constructor for a Pair.
     *
     * @param first  the first object in the Pair
     * @param second the second object in the pair
     */
    public T_Use_Three(TestBean first, TestBean second) {
        super(first, second);
    }

    /**
     * 按照多态来讲，父类的引用指向子类的对象时，调用的方法应该也是子类的方法
     * 但类型擦除与多态有冲突，故采用桥方法来解决这一问题
     */
    public boolean equals(T_Use_Three value) {
        if (!(value instanceof T_Use_Three)) {
            return false;
        }
        return true;
    }

    /**
     * 桥方法
     */
    @Override
    public boolean equals(Object o) {
        return equals((T_Use_Three) o);
    }

}
