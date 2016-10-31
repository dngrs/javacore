package com.dngrs.runners;
import java.util.Arrays;
public class Number {

    public static void main(String[] args) {
        int [][] arr = {{1,1},{2,2}};
        for(int[] element: arr){
            System.out.println(Arrays.toString(element));
        }


        Object object = new Object();
        String s = object.toString();
        System.out.println(s);

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A");
        int a = scan.nextInt();
        System.out.println("Enter B");
        int b = scan.nextInt();
        while (a > b) {
            System.out.print("A: " + a + " ");
            System.out.println("B: " + b);
            a = a - 1;
        }
        System.out.print("A: " + a + " ");
        System.out.println("B: " + b);
        for(int i = 0; i<=10; i++){
            System.out.printf("%3d", i);
        }

        int i = 1;
        System.out.println("Origin: "+i);
        System.out.println("Post-: "+i++);
        System.out.println("After post-: "+i);
        System.out.println("Pre-: "+ ++i);
        System.out.println("After pre-: "+i);


        int count = 0;
        for(int i =0; i<=20; i++){
            if (i%2 == 0){
                ++count;
                System.out.print(i+" ");
            }
        }
        System.out.println("\n" + "Total: " + count);
        */
    }
}
