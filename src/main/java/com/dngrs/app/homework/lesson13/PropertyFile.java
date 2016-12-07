package com.dngrs.app.homework.lesson13;

import java.io.*;
import java.util.*;

/**
 * Created by I. Odokienko on 11/21/16.
 */
public class PropertyFile {

    public static File writePropertyFile(ArrayList<String> inputArray, String fileName) throws IOException{
        File propertyFile = new File("src/test/resources/lesson13/" + fileName);
        Map<String, String> propertyMap = new HashMap<>();
        for(String str: inputArray){
            String [] line = str.split(",");
            propertyMap.put(line[0], line[1]);
        }
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(propertyFile)
                )
        );
        for (String keys: propertyMap.keySet()) {
            writer.append(keys + " = " + propertyMap.get(keys));
            writer.newLine();
        }
        writer.close();
        return propertyFile;
    }
}
