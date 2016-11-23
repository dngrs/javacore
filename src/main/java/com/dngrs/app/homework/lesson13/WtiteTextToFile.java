package com.dngrs.app.homework.lesson13;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by I. Odokienko on 11/18/16.
 */
public class WtiteTextToFile {

    public static File writeTextFromBufferToFile(String fileName, ArrayList<String> resultSet) throws IOException {
        File outputFile = new File("/Users/admin/projects/javacore/src/test/resources/lesson13/" + fileName);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(outputFile)
                )
        );
        for (String element : resultSet) {
            writer.append(element);
            writer.newLine();
        }
        writer.close();
        return outputFile;
    }
}
