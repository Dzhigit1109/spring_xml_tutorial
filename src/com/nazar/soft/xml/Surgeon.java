package com.nazar.soft.xml;

public class Surgeon implements Doctor {

    private String name;
    private int age;

    @Override
    public void treat() {
        System.out.println("Surgeon treat`s");
    }

    @Override
    public void takeMoney() {
        System.out.println("Surgeon takes money");
    }

    @Override
    public void displayInfo() {
        System.out.println("The name of doctor is - " + name + " and the age is - " + age);
    }

    public Surgeon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Surgeon() {
    }
}
