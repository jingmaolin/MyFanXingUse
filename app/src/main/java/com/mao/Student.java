package com.mao;

/**
 * Description:
 * author:jingmaolin
 * email:1271799407@qq.com.
 * phone:13342446520.
 * date: 2018/5/1.
 */

public class Student extends Person{
    private String classNumber;
    private String materTeaName;

    public Student(String classNumber, String materTeaName) {
        this.classNumber = classNumber;
        this.materTeaName = materTeaName;
    }

    public Student(int age, String name, String sex, String classNumber, String materTeaName) {
        super(age, name, sex);
        this.classNumber = classNumber;
        this.materTeaName = materTeaName;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getMaterTeaName() {
        return materTeaName;
    }

    public void setMaterTeaName(String materTeaName) {
        this.materTeaName = materTeaName;
    }

    @Override
    public String toString() {
        super.toString();
        return "Student{" +
                "classNumber='" + classNumber + '\'' +
                ", materTeaName='" + materTeaName + '\'' +
                '}';
    }
}
