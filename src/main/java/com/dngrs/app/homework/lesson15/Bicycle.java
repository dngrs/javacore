package com.dngrs.app.homework.lesson15;

/**
 * Created by I. Odokienko on 12/3/16.
 */
public abstract class Bicycle {
    protected int speed;
    protected int gear;

    public Bicycle(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }

    public void ride() {
        System.out.println("Wroom!");
    }

    public abstract void setSpeed(int speed);

    public abstract void setGear(int gear);
}
