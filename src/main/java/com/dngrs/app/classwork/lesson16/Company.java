package com.dngrs.app.classwork.lesson16;

import java.util.Arrays;

/**
 * Created by I. Odokienko on 11/26/16.
 */
public enum Company {
    EBAY(30, "Ebay Inc"){
        @Override
        public  int getValue(){
            return 666;
        }
    },

    GOOGLE(15, "Google Inc"){
        @Override
        public  int getValue(){
            return 777;
        }
    };

    private int value;
    private String fullName;

    private Company(int value, String fullName) {
        this.value = value;
        this.fullName = fullName;
    }

    public abstract int getValue();

    public static void main(String[] args) {
        for (Company cName : Company.values()) {
            System.out.println("Company value: " +
                    cName.getValue() +
                    " - Company Name: " +
                    cName);
        }

        Arrays.asList(Company.values()).forEach(company ->
                System.out.println("Company name: " + company.name() + " revenue: " + company.getValue()));
    }
}