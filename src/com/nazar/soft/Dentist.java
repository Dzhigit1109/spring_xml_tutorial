package com.nazar.soft;

public class Dentist implements Doctor {

    @Override
    public void treat() {
        System.out.println("Dentist treat`s");
    }

    @Override
    public void takeMoney() {
        System.out.println("Dentist takes money");
    }

}
