package com.dngrs.app.homework.lesson4;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
        public static void main(String[] args) {
            Result result = JUnitCore.runClasses(TestSortArray.class);
            System.out.println("Run tests: " + result.getRunCount());
            System.out.println("Failed tests: " + result.getFailureCount());
            System.out.println("Success: " + result.wasSuccessful()+"\n");
            for (Failure failure : result.getFailures()) {
                System.out.println("Failed tests: " + failure.toString());
            }
        }
}
