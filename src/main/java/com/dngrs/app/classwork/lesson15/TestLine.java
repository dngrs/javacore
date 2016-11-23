package com.dngrs.app.classwork.lesson15;

/**
 * Created by I. Odokienko on 11/19/16.
 */
public class TestLine {
    public static void main(String[] args) {
        Pixel pix1 = new Pixel(10,20);
        Pixel pix2 = new Pixel(20,10);
        Line line = new Line(pix1,pix2);
        line.addPixel(new Pixel(1,1));
        line.getLine();
    }
}
