package com.dngrs.app.homework.lesson15;

/**
 * Created by I. Odokienko on 12/3/16.
 */
public class CustomBicycle extends Bicycle {

    public CustomBicycle(int speed, int gear) {
        super(speed, gear);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(speed);
    }

    public void setGear(int gear) {
        this.gear = gear;
        System.out.println(gear);
    }

    @Override
    public void ride(){
        System.out.println("Wshhhh!");
    }
}
