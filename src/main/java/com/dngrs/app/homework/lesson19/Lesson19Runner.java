package com.dngrs.app.homework.lesson19;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by I. Odokienko on 12/7/16.
 */
public class Lesson19Runner {
    private static String filePath = "src/test/resources/lesson19/PhoneBook.txt";
    private static HashMap<String, ArrayList<Person>> phoneBook;

    public static void main(String[] args) throws IOException {
        phoneBook = PhoneBook.readPhoneBookFromFile(filePath);
        boolean exitProgram = false;
        do {
            System.out.println("CATEGORIES:");
            for (String category : phoneBook.keySet()
                    ) {
                System.out.println(category);
            }
            System.out.println();
            System.out.println("1 - Work with available category");
            System.out.println("2 - Add new category");
            System.out.println("3 - Search in book by name");
            System.out.println("4 - Search in book by number");
            System.out.println("5 - Save all changes to file and exit");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int menu = scanner.nextInt();
                if (menu > 0 && menu <= 5) {
                    switch (menu) {
                        case 1:
                            System.out.println("Enter category name:");
                            String category = new Scanner(System.in).nextLine();
                            if (phoneBook.containsKey(category)) {
                                System.out.println("RECORDs IN CATEGORY");
                                for (Person person : phoneBook.get(category)
                                        ) {
                                    System.out.println("ID:" + person.getId() + " NAME:" + person.getName() + " TELEPHONE:" + person.getTelephoneNumber());
                                }
                                System.out.println();
                                boolean exit = false;
                                do {
                                    System.out.println("1 - Edit existing record");
                                    System.out.println("2 - add new record to existing category");
                                    System.out.println("3 - Exit");
                                    int item = new Scanner(System.in).nextInt();
                                    switch (item) {
                                        case 1:
                                            boolean exitEditMode = false;
                                            do {
                                                System.out.println("Enter ID to edit:");
                                                int id = new Scanner(System.in).nextInt();
                                                Person tmp = null;
                                                for (Person person : phoneBook.get(category)
                                                        ) {
                                                    if (id == person.getId()) {
                                                        tmp = person;
                                                    }
                                                }
                                                System.out.println("1 - edit name");
                                                System.out.println("2 - edit phone number");
                                                System.out.println("3 - Exit edit mode");
                                                int option = new Scanner(System.in).nextInt();
                                                switch (option) {
                                                    case 1:
                                                        System.out.println("Enter new name:");
                                                        String newName = new Scanner(System.in).nextLine();
                                                        tmp.setName(newName);
                                                        break;
                                                    case 2:
                                                        System.out.println("Enter new phone number:");
                                                        String newNumber = new Scanner(System.in).nextLine();
                                                        tmp.setTelephoneNumber(newNumber);
                                                        break;
                                                    case 3:
                                                        exitEditMode = true;
                                                        break;
                                                }
                                            } while (!exitEditMode);
                                        case 2:
                                            System.out.println("Enter name");
                                            String newName = new Scanner(System.in).nextLine();
                                            System.out.println("Enter phone number");
                                            String newTelephone = new Scanner(System.in).nextLine();
                                            ArrayList<Person> currentRecords = phoneBook.get(category);
                                            currentRecords.add(new Person(newName, newTelephone));
                                            break;
                                        case 3:
                                            exit = true;
                                    }
                                } while (!exit);
                            } else {
                                System.out.println("Category doesn't exist");
                            }
                            break;
                        case 2:
                            System.out.println("Enter name of new category:");
                            String newCategory = new Scanner(System.in).nextLine();
                            System.out.println("Enter name:");
                            String newName = new Scanner(System.in).nextLine();
                            System.out.println("Enter phone:");
                            String newPhone = new Scanner(System.in).nextLine();
                            ArrayList<Person> persons = new ArrayList<>();
                            persons.add(new Person(newName, newPhone));
                            phoneBook.put(newCategory, persons);
                            break;
                        case 3:
                            System.out.println("Enter name to search");
                            String namePattern = new Scanner(System.in).nextLine();
                            PhoneBook.searchByName(namePattern);
                            break;
                        case 4:
                            System.out.println("Enter name to search");
                            String telPattern = new Scanner(System.in).nextLine();
                            PhoneBook.searchByTelNumber(telPattern);
                            break;
                        case 5:
                            PhoneBook.writePhoneBookToFile(phoneBook);
                            exitProgram = true;
                            break;
                    }
                } else {
                    System.out.println("Wrong input value. Try again...");
                }
            } else {
                System.out.println("Wrong input value. Try again...");
            }
        } while (!exitProgram);
    }
}
