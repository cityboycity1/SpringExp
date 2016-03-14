package com.endava.siv5l.DependencyInjection;
/**
 * Created by vlica on 3/10/2016.
 */
public class DependencyInjectionDemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Drawing drawing = new Drawing();
        drawing.setShape(triangle);
        drawing.draw();
    }
}
