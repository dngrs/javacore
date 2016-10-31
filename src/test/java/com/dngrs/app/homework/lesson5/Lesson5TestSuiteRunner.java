package com.dngrs.app.homework.lesson5;

import com.dngrs.app.homework.lesson7.Lesson7TestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by I. Odokienko on 10/31/16.
 */
public class Lesson5TestSuiteRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Lesson5TestSuite.class);
        System.out.println("Run tests: " + result.getRunCount());
        System.out.println("Failed tests: " + result.getFailureCount());
        System.out.println("Success: " + result.wasSuccessful()+"\n");
        for (Failure failure : result.getFailures()) {
            System.out.println("Failed tests: " + failure.toString());
        }
    }
}
