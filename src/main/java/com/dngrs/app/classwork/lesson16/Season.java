package com.dngrs.app.classwork.lesson16;

import java.util.Arrays;

/**
 * Created by I. Odokienko on 11/26/16.
 */
public enum Season {
    WINTER, SPRING, SUMMER,AUTUMN;

    public static void main(String[] args) {
        System.out.println(SPRING.name());
        System.out.println(SPRING.toString());
        String name = "Winter";
        Season season = Season.valueOf(name.toUpperCase());
        System.out.println(season);
        System.out.println(Season.values());
        System.out.println(Arrays.toString(Season.values()));

        try{
            season = Season.valueOf("SUMMEr");
            switch(season){
                case SPRING:
                    System.out.println(season.toString());
                    break;
            }
        } catch (IllegalArgumentException e){
            System.out.println("Invalid argument");
        }
    }

    @Override
    public String toString(){
       return "Season{}";
    }
}

