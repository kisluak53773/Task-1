package com.company.filereader;

import org.testng.annotations.Test;

import java.io.File;
import java.net.URISyntaxException;

import static org.testng.Assert.*;

public class ReadFromFileTest {

    @Test
    public void testRead() throws URISyntaxException {
        File path= null;
        path = new File(Thread.currentThread().getContextClassLoader().getResource("data/test.txt").toURI());        String actual=ReadFromFile.read(path);
        String expected="22 33 28";
        assertEquals(actual,expected);
    }
}