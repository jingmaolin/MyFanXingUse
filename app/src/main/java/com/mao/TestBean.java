package com.mao;

/**
 * Description ：
 * Created by jingmaolin on 2018/4/25.
 * Job number：600029
 * Phone ：13342446520
 * Email：jingmaolin@syswin.com
 * Person in charge ： jingmaolin
 * Leader：wangyue
 */

public class TestBean {
    private int age;
    private String name;
    private String factory;

    public TestBean() {

    }

    public TestBean(int age, String name, String factory) {
        this.age = age;
        this.name = name;
        this.factory = factory;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}
