package com.dngrs.app.homework.lesson12;

/**
 * Created by I. Odokienko on 11/9/16.
 */
public class Enigma {
    public static final String ORIGINAL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabsdefghijklmnopqrstuvwxyz0123456789 ";
    public static final String CODE = " yz0123456789opqrstuvwxefghijklmnUVWXYZabsdKLMNOPQRSTABCDEFGHIJ";

    public static String codeStringEnigma(String str) {
        StringBuilder codedString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int index = ORIGINAL.indexOf(str.charAt(i));
            char letter = CODE.charAt(index);
            codedString = codedString.append(letter);
        }
        return codedString.toString();
    }

    public static String decodeStringEnigma(String str) {
        StringBuilder decodedString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int index = CODE.indexOf(str.charAt(i));
            char letter = ORIGINAL.charAt(index);
            decodedString = decodedString.append(letter);
        }
        return decodedString.toString();
    }
}
