package com.nazar.soft.xml;

public class Therapist implements Doctor {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void treat() {
        System.out.println("Therapist treat`s");
    }

    @Override
    public void takeMoney() {
        System.out.println("Therapist take`s money");
    }

    @Override
    public void displayInfo() {
        System.out.println("The doctor name is - " + name + " and the age is - " + age);
    }
}
