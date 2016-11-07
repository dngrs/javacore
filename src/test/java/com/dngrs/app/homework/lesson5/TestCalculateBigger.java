package com.dngrs.app.homework.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestCalculateBigger {
    @Test
    @FileParameters(value = "src/test/resources/CalculateBigger.scv", mapper = CsvWithHeaderMapper.class)
    public void testCalculateBigger(double area1, double area2, double bigger) {
        Assert.assertEquals(Calculator.calculateBigger(area1,area2), bigger,0.001);
    }
}
