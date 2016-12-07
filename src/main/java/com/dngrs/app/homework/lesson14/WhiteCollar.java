package com.dngrs.app.homework.lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by I. Odokienko on 11/26/16.
 */
public class WhiteCollar extends Human{
    private String company;

    public WhiteCollar(String name, int age, String company){
        super(name, age);
        this.company = company;
    }

    public String getCompany(){
        return company;
    }


    public void setCompany(String company){
        if(nameIsCorrect(company)){
            this.company = company;
        } else {
            System.out.println("Company name is invalid");
        }
    }

    private static boolean nameIsCorrect (String company){
        Pattern p = Pattern.compile("[a-zA-Z\\s,-]+");
        Matcher m = p.matcher(company);
        return m.matches();
    }
}
