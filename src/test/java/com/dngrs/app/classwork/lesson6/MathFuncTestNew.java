package com.dngrs.app.classwork.lesson6;


import com.dngrs.app.classwork.lesson4.MathFunc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

/*
@RunWith(JUnitParamsRunner.class)
public class MathFuncTestNew {
    @Test
    @FileParameters(value = "src/test/resources/testdata.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expOut) {
        Assert.assertEquals(expOut, MathFunc.multiply(argA, argB)); } //make sure that variables are in same order and types as in csv file
}
*/

@RunWith(value = Parameterized.class)
public class MathFuncTestNew {

    private int numberA, numberB, expected;

    //parameters pass via this constructor
    public MathFuncTestNew(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    //Declares parameters here
    @Parameterized.Parameters(name = "{index}: multiply({0}*{1})={2}") //test log output
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1}, //If parameter is “{ 2, 2, 4 }”,
                {2, 2, 4}, // then {index} = test run # (from 0), {8, 2, 16}, // {0} = 2, {1} = 2, {2} = 2
                {4, 5, 20}
        });
    }

    @Test
    public void test_add() {
        Assert.assertEquals(expected, MathFunc.multiply(numberA, numberB));
    }
}

