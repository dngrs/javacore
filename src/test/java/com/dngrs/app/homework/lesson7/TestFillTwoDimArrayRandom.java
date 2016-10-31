package com.dngrs.app.homework.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import static com.dngrs.app.homework.lesson7.Lesson7Functions.fillTwoDimArrayRandom;

@RunWith(JUnitParamsRunner.class)
public class TestFillTwoDimArrayRandom {
    @Test
    @FileParameters(value = "src/test/resources/fillTwoDimArrayRandom.scv", mapper = CsvWithHeaderMapper.class)
    public void checkArrayLength(int iSize, int jSize, int min, int max) {
        int [][] array = fillTwoDimArrayRandom(iSize, jSize, min, max);
        Assert.assertEquals(iSize, array.length);
        for(int i = 0; i<array.length; i++){
            Assert.assertEquals(jSize, array[i].length);
        }
    }

    @Test
    @FileParameters(value = "src/test/resources/fillTwoDimArrayRandom.scv", mapper = CsvWithHeaderMapper.class)
    public void checkElementValue(int iSize, int jSize, int min, int max) {
        int[][] array = fillTwoDimArrayRandom(iSize, jSize, min, max);
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j <array[i].length; j++){
                Assert.assertTrue(array[i][j] >= min && array[i][j] <= max);
            }
        }
    }
}
