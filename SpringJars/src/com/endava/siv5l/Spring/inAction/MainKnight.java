package com.endava.siv5l.Spring.inAction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vlica on 3/14/2016.
 */
public class MainKnight {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        BraveKnight braveKnight = (BraveKnight) context.getBean("knight");
        braveKnight.embarkOnQuest();

    }
}
