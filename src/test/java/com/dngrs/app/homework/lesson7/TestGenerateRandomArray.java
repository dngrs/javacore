package com.dngrs.app.homework.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.dngrs.app.homework.lesson7.Lesson7Functions.generateRandomArray;

@RunWith(JUnitParamsRunner.class)
public class TestGenerateRandomArray {
    @Test
    @FileParameters(value = "src/test/resources/checkArrayLength.scv", mapper = CsvWithHeaderMapper.class)
    public void checkArrayLength(int expectedSize, int min, int max, int size){
        Assert.assertEquals(expectedSize, generateRandomArray(min,max,size).length);
    }

    @Test
    @FileParameters(value = "src/test/resources/checkArrayLength.scv", mapper = CsvWithHeaderMapper.class)
    public void checkElementValue(int expectedSize, int min, int max, int size){
        int [] array = generateRandomArray(min,max,size);
        for (int i = 0; i<array.length; i++){
            Assert.assertTrue(array[i]>=min && array[i]<=max);
        }

    }
}
