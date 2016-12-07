package com.dngrs.app.homework.lesson17;

/**
 * Created by I. Odokienko on 12/4/16.
 */
public enum People {
    KANYE_WEST("Kanye West", 39),
    EMINEM("Eminem", 44),
    WILL_SMITH("Will Smith",48),
    JENNIFER_LOPEZ("Jennifer Lopez",47),
    RIHANNA("Rihanna", 28);

    private String fullName;
    private int age;

    private People(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName(){
        return fullName;
    }

    public int getAge(){
        return age;
    }
}
