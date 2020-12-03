package com.nazar.soft.xml;

public class Dentist implements Doctor {

    private final String name;
    private final int age;

    @Override
    public void treat() {
        System.out.println("Dentist treat`s");
    }

    @Override
    public void takeMoney() {
        System.out.println("Dentist takes money");
    }

    @Override
    public void displayInfo() {
        System.out.println("The name of doctor is - " + name + " and the age is - " + age);
    }

    public Dentist(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
