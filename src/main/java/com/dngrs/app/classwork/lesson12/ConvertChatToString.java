package com.dngrs.app.classwork.lesson12;

/**
 * Created by I. Odokienko on 11/9/16.
 */
public class ConvertChatToString {
    public static void main(String[] args) {
        char [] chars = {'a', 'b', 'c'};
        char [] chars1 = {'q', 'w', 'x'};
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<chars.length; i++){
            stringBuilder.append(chars[i]);
        }
        String str = stringBuilder.toString();
        System.out.println(str);
        String str2 = new StringBuilder(new String(chars1)).toString();
        System.out.println(str2);
    }
}
