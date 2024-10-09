package com.example.springProject.model;

public class Student {
    private int prn;
    private String name;
    private int age;
    public Student(int prn, String name, int age) {
        this.prn = prn;
        this.name = name;
        this.age = age;

    }
    public int getPrn() {
        return prn;
    }
    public void setPrn(int prn) {
        this.prn = prn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
