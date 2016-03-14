package com.endava.siv5l.DependencyInjection;

/**
 * Created by vlica on 3/10/2016.
 */
public class Drawing {
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void draw(){
        this.shape.draw();
    }
}
