package com.endava.siv5l.Spring.netExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        //Square square = (Square) context.getBean("square");
        //square.draw();

        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
}
