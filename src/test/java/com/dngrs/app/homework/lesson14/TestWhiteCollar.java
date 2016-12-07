package com.dngrs.app.homework.lesson14;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by I. Odokienko on 12/2/16.
 */

@RunWith(JUnitParamsRunner.class)
public class TestWhiteCollar {
    @Test
    @FileParameters(value = "src/test/resources/lesson14/TestSetCompany.txt", mapper = CsvWithHeaderMapper.class)
    public void TestGetAge(String input, String expected){
        WhiteCollar human = new WhiteCollar("name", 10, "default");
        human.setCompany(input);
        System.out.println(human.getCompany());
        Assert.assertEquals(human.getCompany(), expected);
    }
}
