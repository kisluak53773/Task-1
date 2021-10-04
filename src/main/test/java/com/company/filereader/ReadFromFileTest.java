package com.company.filereader;

import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.*;

public class ReadFromFileTest {

    @Test
    public void testRead() {
        File path=new File("src/main/resources/data/test.txt");
        String actual=ReadFromFile.read(path);
        String expected="22 33 28";
        assertEquals(actual,expected);
    }
}