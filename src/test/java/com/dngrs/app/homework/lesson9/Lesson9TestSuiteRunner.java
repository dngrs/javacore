package com.dngrs.app.homework.lesson9;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by I. Odokienko on 11/7/16.
 */

public class Lesson9TestSuiteRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Lesson9TestSuite.class);
        System.out.println("Run tests: " + result.getRunCount());
        System.out.println("Failed tests: " + result.getFailureCount());
        System.out.println("Success: " + result.wasSuccessful()+"\n");
        for (Failure failure : result.getFailures()) {
            System.out.println("Failed tests: " + failure.toString());
        }
    }
}
