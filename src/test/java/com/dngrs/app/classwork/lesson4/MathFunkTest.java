package com.dngrs.app.classwork.lesson4;

import org.junit.Test;
import org.junit.Assert;


/**
 * Created by admin on 10/12/16.
 */
public class MathFunkTest {
    @Test
    public void multiplyTest(){
        int a = 1, b = 2, expRes=2;
        MathFunc math = new MathFunc();
        Assert.assertEquals(expRes, math.multiply(a,b));
    }
}