package com.aventurier.domain.entity;

public class Hero {
    private int x;
    private int y;

    public Hero(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setPosition(int x,int y){
        this.x = x;
        this.y = y;
    }
}
