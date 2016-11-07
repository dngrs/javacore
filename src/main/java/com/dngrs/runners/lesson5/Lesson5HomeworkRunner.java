package com.dngrs.runners.lesson5;

import com.dngrs.app.homework.lesson5.Calculator;

import java.util.Scanner;

public class Lesson5HomeworkRunner {
    public static void main(String args[]) {
        boolean exitCondition = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose one of available item:");
            System.out.println("1 - check if a,b,c are the sides of a right-angled triangle");
            System.out.println("2 - calculate circle area with r radius");
            System.out.println("3 - check if a number is even or odd");
            System.out.println("4 - check circle area is bigger");
            System.out.println("5 - exit");
            if(scanner.hasNextInt()){
                int item = scanner.nextInt();
                switch(item){
                    case 1:
                        System.out.println("Enter a");
                        double a = scanner.nextDouble();
                        System.out.println("Enter b ");
                        double b = scanner.nextDouble();
                        System.out.println("Enter c");
                        double c = scanner.nextDouble();
                        if (Calculator.rightAngledCheck(a, b, c)) {
                            System.out.println("Right-angled triangle");
                        } else {
                            System.out.println("Not right-angled triangle.");
                        }
                        break;
                    case 2:
                        System.out.println("Enter a circle radius:");
                        double r = scanner.nextDouble();
                        System.out.println("Circle area = " + Calculator.calculateCircleArea(r));
                        break;
                    case 3:
                        System.out.println("Enter a number:");
                        int number = scanner.nextInt();
                        if (Calculator.isOdd(number)) {
                            System.out.println(number + " is odd.");
                        } else {
                            System.out.println(number + " is even.");
                        }
                        break;
                    case 4:
                        System.out.println("Enter area1:");
                        double area1 = scanner.nextDouble();
                        System.out.println("Enter area2:");
                        double area2 = scanner.nextDouble();
                        Calculator.calculateBigger(area1, area2);
                        break;
                    case 5:
                        exitCondition = false;
                        System.out.println("Exiting program ...");
                        break;
                }
            } else System.out.println("Wrong input");
        } while (exitCondition);
    }
}