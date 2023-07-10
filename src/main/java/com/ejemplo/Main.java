package com.ejemplo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService userService = context.getBean(UserService.class);
        userService.miService.imprimirSaludo();

        context.close();
    }    
}
