package com.dngrs.app.classwork.lesson16;

/**
 * Created by I. Odokienko on 11/26/16.
 */
public enum Holidays {
    NEW_YEAR(1,"January", "New Year");

    private int day;
    private String month;
    private String fullName;

    private Holidays(int day, String month, String fullName) {
        this.day = day;
        this.month = month;
        this.fullName = fullName;
    }

    public int getDay(){
        return this.day;
    }

    public String getMonth(){
        return this.month;
    }

    public String getFullName(){
        return this.fullName;
    }

    public static void main(String[] args) {
        for(Holidays myHoliday: Holidays.values()){
            System.out.println(myHoliday.getFullName() + " holiday is on " + myHoliday.getMonth() + ", " + myHoliday.getDay());
        }
    }

}
