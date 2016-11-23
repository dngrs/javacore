package com.dngrs.app.homework.lesson12;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by I. Odokienko on 11/23/16.
 */
@RunWith(JUnitParamsRunner.class)
public class TestEnigma {
    private Enigma testInstance = null;

    @Before
    public void setUp() {
        testInstance = new Enigma();
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson12/EncryptEnigma.csv", mapper = CsvWithHeaderMapper.class)
    public void testCodeStringEnigma(String input, String expected) {
        Assert.assertEquals(expected, Enigma.codeStringEnigma(input));
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson12/EncryptEnigma.csv", mapper = CsvWithHeaderMapper.class)
    public void testDecodeStringEnigma(String expected, String input) {
        Assert.assertEquals(expected, Enigma.decodeStringEnigma(input));
    }

    @After
    public void tearDown() {
        testInstance = null;
    }
}
