package com.dngrs.runners.lesson12;

import com.dngrs.app.homework.lesson12.*;

import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by I. Odokienko on 11/14/16.
 */
public class Lesson12Runner {
    public static void main(String[] args) {
        boolean exitCondition = true;
        do {
            System.out.println("Choose one of available item:");
            System.out.println("1 - Run ArrayParser");
            System.out.println("2 - Select alphabetical symbols from input array");
            System.out.println("3 - Divide input string by keyword");
            System.out.println("4 - Encrypt input string using Enigma algorithm");
            System.out.println("5 - Decrypt input string using Enigma algorithm");
            System.out.println("6 - Encrypt input string using Caesar algorithm");
            System.out.println("7 - Decrypt input string using Caesar algorithm");
            System.out.println("8 - Exit");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int item = scan.nextInt();
                if (item > 0 && item <= 8) {
                    switch (item) {
                        case 1:
                            String separator;
                            Locale locale = Locale.getDefault();
                            DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
                            symbols.getDecimalSeparator();
                            String defaultSeparator = Character.toString(symbols.getDecimalSeparator());
                            do {
                                System.out.println("Set separator. Note, that local decimal separator can't be used");
                                separator = new Scanner(System.in).nextLine();
                                if (separator.length() != 1) {
                                    System.out.println("Separator must be only one character");
                                }
                                if (separator.equals(defaultSeparator)) {
                                    System.out.println("This character is used as local decimal separator");
                                }
                            } while (separator.length() != 1 || separator.equals(defaultSeparator));
                            System.out.println("Enter sequence of int numbers via separator and press Enter:");
                            String input = new Scanner(System.in).nextLine();
                            System.out.println(Arrays.toString(ArrayParser.parseArray(input, separator)));
                            break;
                        case 2:
                            System.out.println("Enter sequence of data via \',\' separator");
                            String inputLine = new Scanner(System.in).nextLine();
                            System.out.println(PrintLetters.printLetters(inputLine));
                            break;
                        case 3:
                            System.out.println("Enter string");
                            String line = new Scanner(System.in).nextLine();
                            System.out.println("Enter key word");
                            String keyWord = new Scanner(System.in).nextLine();
                            for (String element : KeyWord.divideString(line, keyWord)) {
                                System.out.println(element);
                            }
                            break;
                        case 4:
                            System.out.println("Enter string to encrypt: ([a-z,A-Z,0-9])");
                            String codeString = new Scanner(System.in).nextLine();
                            System.out.println("Encrypted string: " + Enigma.codeStringEnigma(codeString));
                            break;
                        case 5:
                            System.out.println("Enter string to decrypt: ([a-z,A-Z,0-9])");
                            String decodeString = new Scanner(System.in).nextLine();
                            System.out.println("Decrypted string: " + Enigma.decodeStringEnigma(decodeString));
                            break;
                        case 6:
                            System.out.println("Enter string to encrypt: ([A-Z])");
                            String cryptString = new Scanner(System.in).nextLine();
                            System.out.println("Enter offset value:");
                            int offset = new Scanner(System.in).nextInt();
                            System.out.println("Decrypted string: " + EncryptCaesar.codeCaesar(cryptString, offset));
                            break;
                        case 7:
                            System.out.println("Enter string to decrypt: ([A-Z])");
                            String decryptString = new Scanner(System.in).nextLine();
                            System.out.println("Enter offset value:");
                            offset = new Scanner(System.in).nextInt();
                            System.out.println("Decrypted string: " + EncryptCaesar.decodeCaesar(decryptString, offset));
                            break;
                        case 8:
                            exitCondition = false;
                            break;
                    }
                } else {
                    System.out.println("Wrong input value. Try again...");
                }
            } else {
                System.out.println("Wrong input value. Try again...");
            }
        } while (exitCondition);
        System.out.println("Exiting program ...");
    }
}
