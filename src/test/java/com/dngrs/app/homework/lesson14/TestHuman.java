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
public class TestHuman {

    @Test
    @FileParameters(value = "src/test/resources/lesson14/TestHuman.txt", mapper = CsvWithHeaderMapper.class)
    public void TestGetName(String name, int age){
        Human human = new Human(name, age);
        Assert.assertEquals(human.getName(), name);
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson14/TestHuman.txt", mapper = CsvWithHeaderMapper.class)
    public void TestGetAge(String name, int age){
        Human human = new Human(name, age);
        Assert.assertEquals(human.getAge(), age);
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson14/TestSetAge.txt", mapper = CsvWithHeaderMapper.class)
    public void TestSetAge(int input, int expected){
        Human human = new Human("test", 0);
        human.setAge(input);
        Assert.assertEquals(human.getAge(), expected);
    }


}
