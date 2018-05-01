package com.mao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Pair;

import com.mao.fanxing.T_Use;
import com.mao.fanxing.T_Use_Ano;
import com.mao.fanxing.T_Use_Four;
import com.mao.fanxing.T_Use_Three;
import com.mao.fanxing._Use;

/**
 * 泛型的使用
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        use_2();
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
        Pair<TestBean, TestBean> pair = t_use_three;
        //类型擦除地方，类型擦除后，Pair<TestBean, TestBean> 变成了Pair,在最终的编译器中使用的类型为object，故下面方法调用时仍旧调用的是object参数的方法
        pair.equals(new T_Use_Three(new TestBean(), new TestBean()));//断点跟踪调用的方法
    }

    /**
     * T_Use_Four
     */
    private void t_use_four() {
        T_Use_Four<TestBean> four = new T_Use_Four<>();
        TestBean b = new TestBean(1, "2", "3");
        Log.d(TAG, "t_use_four: " + b.getClass());
        four.setValue(0, b);
        TestBean t = four.getValue(0);
        Log.d(TAG, "t_use_four: " + t.toString());
    }

    /**
     * _Use
     * 上界：不可调用 方法中参数类型为T及其子类，其他可调用;另：接受返回的对象时，只能以extends 后的父类类型接收
     */
    private void _use() {
        _Use<Student> use_stu = new _Use();
        use_stu.setFirst(new Student(1, "2", "3", "1", "1"));
        use_stu.setSecond(new Student(4, "5", "6", "2", "2"));
        _Use<? extends Person> p = use_stu;
//        p.setSecond(new Student("",""));//error
//        p.setSecond(new Person(1,"",""));//error
//        Student v = p.getFirst();//error
        Person value = p.getFirst();//ok
//        p.haha(new Person());error
        p.hehe("");
        p.getvalue();
    }

    /**
     * _Use
     * 下界：可以向泛型对象写入（写入对象时，只能写入super 后的子类），但不能读取
     */
    private void use_2() {
        _Use<Person> use_stu = new _Use();
        use_stu.setFirst(new Person(1, "2", "3"));
        use_stu.setSecond(new Person(4, "5", "6"));
        _Use<? super Student> p = use_stu;
//        Student value = p.getFirst();//error
//        Person value = p.getFirst();//error
//        p.setFirst(new Person(0,"", ""));//error
        p.setFirst(new Student("", ""));
        Log.d(TAG, "use_2: " + p.getFirst().toString());
    }

    /**
     * 超类型的另一种使用
     */
    public void use_3() {
        String[] a = new String[]{};
        MainActivity.min(a);
    }


    public static <T extends Comparable<? super T>> T min(T[] a) {
        T min = a[0];
        T max = a[0];
        if ((min.compareTo(max)) > 0) {

        }
        return null;
    }
}
