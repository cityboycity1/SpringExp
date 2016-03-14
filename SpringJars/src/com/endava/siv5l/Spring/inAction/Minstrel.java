package com.endava.siv5l.Spring.inAction;

import java.io.PrintStream;

/**
 * Created by vlica on 3/14/2016.
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("before");
    }

    public void singAfterQuest(){
        stream.println("after");
    }
}
