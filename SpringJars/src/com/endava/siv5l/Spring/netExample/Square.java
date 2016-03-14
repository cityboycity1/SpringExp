package com.endava.siv5l.Spring.netExample;

public class Square {

    private String type;
    private int height;


    public Square(String type){
        this.type = type;
    }

    public Square(int height){
        this.height = height;
    }

    public Square(String type, int height){
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void draw(){
        System.out.println(getType() + " Square drawn of height: " + getHeight() );
    }



}
