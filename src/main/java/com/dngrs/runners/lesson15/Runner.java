package com.dngrs.runners.lesson15;

import com.dngrs.app.homework.lesson15.Bicycle;
import com.dngrs.app.homework.lesson15.BicycleWithRing;
import com.dngrs.app.homework.lesson15.BicycleWithRingInterface;
import com.dngrs.app.homework.lesson15.CustomBicycle;

/**
 * Created by I. Odokienko on 12/3/16.
 */
public class Runner {
    public static void main(String[] args) {
        BicycleWithRingInterface myBicycle1 = new BicycleWithRing(10, 20);
        myBicycle1.ring();
        Bicycle myBicycle2 = new CustomBicycle(100,200);
        myBicycle2.ride();
    }
}
