package com.company.custommasive;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomMassiveTest {

    @Test
    public void testGetMas() {
        int []ints=new int[]{12,14};
        CustomMassive cs=new CustomMassive(ints);
        int []actual= cs.getMas();
        int []expected=new int[]{12,14};
        assertEquals(actual,expected);
    }

    @Test
    public void testToStr() {
        int []ints=new int[]{12,14};
        CustomMassive cs=new CustomMassive(ints);
        String actual= cs.ToStr();
        String expected="12 14 ";
    }
}