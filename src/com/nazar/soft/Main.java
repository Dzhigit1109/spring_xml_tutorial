package com.nazar.soft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Doctor doctor = applicationContext.getBean("Doctor", Dentist.class);
        doctor.treat();
        doctor.takeMoney();
    }
}
