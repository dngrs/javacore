package com.dngrs.app.classwork.lesson15;

import java.util.Arrays;

/**
 * Created by I. Odokienko on 11/19/16.
 */
public class Line {
    /*
    private ArrayList<Pixel> pix = new ArrayList<Pixel>();

    public Line(Pixel pix1, Pixel pix2){
        pix.add(pix1);
        pix.add(pix2);
    }

    public ArrayList<Pixel> addPixel(Pixel pixel){
        pix.add(pixel);
        return pix;
    }
    */

    public Pixel[] line = new Pixel[2];

    public Line(Pixel pix1, Pixel pix2){
        line[0] = pix1;
        line[1] = pix2;
    }

    public void addPixel(Pixel pixel){
        Pixel [] newLine = new Pixel[line.length + 1];
        System.arraycopy(line, 0, newLine, 0, line.length);
        newLine[newLine.length-1] = pixel;
        line = newLine;
    }

    public void getLine(){
        for(int i = 0; i<line.length; i++){
            System.out.println(Arrays.toString(line[i].getCoordinates()));
        }
    }
}
