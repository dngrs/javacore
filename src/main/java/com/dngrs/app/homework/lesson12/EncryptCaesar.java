package com.dngrs.app.homework.lesson12;

/**
 * Created by I. Odokienko on 11/13/16.
 */
public class EncryptCaesar {
    public static final String ORIGINAL = "ABCDEFGHIJKLNMOPQRSTUVWXYZ";

    public static String codeCaesar(String str, int shift) {
        StringBuilder codedString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int indexOfChar = ORIGINAL.indexOf(str.charAt(i));
            int indexOfCodedChar = (indexOfChar + shift) % 26;
            codedString = codedString.append(ORIGINAL.charAt(indexOfCodedChar));
        }
        return codedString.toString();
    }

    public static String decodeCaesar(String str, int shift) {
        StringBuilder decodedString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int indexOfChar = ORIGINAL.indexOf(str.charAt(i));
            int indexOfDecodedChar = ((indexOfChar - shift) % 26 + 26) % 26;
            decodedString = decodedString.append(ORIGINAL.charAt(indexOfDecodedChar));
        }
        return decodedString.toString();
    }
}
