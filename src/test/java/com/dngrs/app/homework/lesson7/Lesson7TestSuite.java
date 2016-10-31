package com.dngrs.app.homework.lesson7;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by I. Odokienko on 10/31/16.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestCountEvenElements.class,
        TestFillArray.class,
        TestFillTwoDimArrayRandom.class,
        TestGenerateRandomArray.class,
        TestGetMaxElement.class,
        TestGetMinElement.class
})
public class Lesson7TestSuite {
}
