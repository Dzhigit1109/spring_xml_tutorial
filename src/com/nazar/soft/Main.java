package com.nazar.soft;

import com.nazar.soft.Airtel.Airtel;
import com.nazar.soft.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        Doctor drymon = applicationContext.getBean("drymon", Dentist.class);
        drymon.displayInfo();

        Doctor nazar = applicationContext.getBean("nazar", Surgeon.class);
        nazar.displayInfo();

        Doctor alina = applicationContext.getBean("alina", Therapist.class);
        alina.displayInfo();

        Student tanya = applicationContext.getBean("tanya", Student.class);
        tanya.displayWhoIsLooting();

        Student sasha = applicationContext.getBean("sasha", Student.class);
        sasha.displayWhoIsLooting();

        applicationContext.getBean("airtel", Airtel.class).service();
    }
}
