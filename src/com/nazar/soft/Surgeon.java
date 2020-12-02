package com.nazar.soft;

public class Surgeon implements Doctor {

    @Override
    public void treat() {
        System.out.println("Surgeon treat`s");
    }

    @Override
    public void takeMoney() {
        System.out.println("Surgeon takes money");
    }

}
