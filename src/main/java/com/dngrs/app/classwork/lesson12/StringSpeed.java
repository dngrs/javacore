package com.dngrs.app.classwork.lesson12;

/**
 * Created by I. Odokienko on 11/9/16.
 */
public class StringSpeed {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for(int i = 0; i< 100000L; i++){
            c = c.concat(b);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        StringBuilder d = new StringBuilder("start");
        b = "finish";
        for(int i = 0; i< 100000L; i++){
            d = d.append(b);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
