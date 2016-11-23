package com.dngrs.app.classwork.lesson13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by I. Odokienko on 11/12/16.
 */
public class ReadFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Ussers/admin/projects/javacore/src/test/resources/TestData.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
            //System.out.println("Test");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Print this anyway");
        }
    }
}