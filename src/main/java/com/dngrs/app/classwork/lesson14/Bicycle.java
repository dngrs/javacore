package com.dngrs.app.classwork.lesson14;

/**
 * Created by I. Odokienko on 11/16/16.
 */
public class Bicycle {
    private int wheelSize;
    private String color;
    private int frameSize;
    private String breakType;

    public Bicycle(String color){
        //this();
        this.color = color;
    }

    public Bicycle(){
        wheelSize = 5;
        color = "red";
        frameSize = 10;
        breakType = "manual";
    }

}
