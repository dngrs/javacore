package com.dngrs.app.homework.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class TestCalculateCircleArea {
    @Test
    @FileParameters(value = "src/test/resources/CalculateCircleArea.scv", mapper = CsvWithHeaderMapper.class)
    public void testCalculateCircleArea(double radius, double area) {
        Assert.assertEquals(Calculator.calculateCircleArea(radius),area, 0.1);
    }
}

