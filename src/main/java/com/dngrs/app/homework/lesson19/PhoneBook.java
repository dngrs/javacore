package com.dngrs.app.homework.lesson19;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by I. Odokienko on 12/6/16.
 */
public class PhoneBook {
    private static String filePath = "src/test/resources/lesson19/PhoneBook.txt";
    private static String outputFilePath = "src/test/resources/lesson19/OutputPhoneBook.txt";
    private static HashMap<String, ArrayList<Person>> phoneBook;

    public static HashMap<String, ArrayList<Person>> readPhoneBookFromFile(String filePath) throws IOException {
        phoneBook = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        //Read and parse file by line
        while ((line = reader.readLine()) != null) {
            String[] singleRecord = line.split(",");
            //Parse category
            String category = singleRecord[0];
            //Parse name
            String name = singleRecord[1];
            //Parse telephone records
            String telephoneNumber = singleRecord[2];
            //Create phoneBook HashMap
            //Add new category if doesn't exist
            if (!phoneBook.containsKey(category)) {
                ArrayList<Person> persons = new ArrayList<>();
                //Add person
                persons.add(new Person(name, telephoneNumber));
                phoneBook.put(category, persons);
            }
            //Else add new record to existing category
            else {
                ArrayList<Person> persons = phoneBook.get(category);
                persons.add(new Person(name, telephoneNumber));
            }
        }
        return phoneBook;
    }

    public static void writePhoneBookToFile(HashMap<String, ArrayList<Person>> phoneBook) throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(filePath)
                )
        );
        for (String category : phoneBook.keySet()
                ) {
            for (Person person : phoneBook.get(category)
                    ) {
                writer.append(category + ",");
                writer.append(person.getName() + ",");
                writer.append(person.getTelephoneNumber());
                writer.newLine();
            }
        }
        writer.close();
    }

    public static void searchByName(String name) {
        name = name.toLowerCase();
        for (String category : phoneBook.keySet()
                ) {
            for (Person person : phoneBook.get(category)
                    ) {
                if (person.getName().toLowerCase().contains(name)) {
                    System.out.println("CATEGORY: " + category + " NAME: " + person.getName() + " TEL: " + person.getTelephoneNumber());
                }
            }
        }
        System.out.println();
    }

    public static void searchByTelNumber(String number) {
        for (String category : phoneBook.keySet()
                ) {
            for (Person person : phoneBook.get(category)
                    ) {
                if (person.getTelephoneNumber().contains(number)) {
                    System.out.println("CATEGORY: " + category + " NAME: " + person.getName() + " TEL: " + person.getTelephoneNumber());
                }
            }
        }
        System.out.println();
    }
}