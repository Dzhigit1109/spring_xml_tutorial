package com.nazar.soft.Airtel;

public class HelloService implements Service{
    @Override
    public void giveService() {
        System.out.println("Hello service activated");
    }
}
