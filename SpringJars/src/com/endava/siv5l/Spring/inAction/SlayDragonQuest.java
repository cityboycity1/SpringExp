package com.endava.siv5l.Spring.inAction;

import java.io.PrintStream;

/**
 * Created by vlica on 3/14/2016.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
        System.out.println("SlayDragonQuest");
    }
}
