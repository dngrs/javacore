package com.dngrs.app.homework.lesson15;

/**
 * Created by I. Odokienko on 12/3/16.
 */
public class BicycleWithRing extends CustomBicycle implements BicycleWithRingInterface {

    public BicycleWithRing(int speed, int gear){
        super(speed,gear);
    }

    public void ring(){
        System.out.println("Di-ling!");
    }

}
