package com.company.service.impl;

import com.company.service.impl.MassiveMathImplementation;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MassiveMathImplementationTest {

    @Test
    public void testMin() {
        MassiveMathImplementation ms=new MassiveMathImplementation();
        int []test=new int[]{11,12};
        int actual=ms.min(test);
        int expected=11;
        assertEquals(actual,expected);
    }

    @Test
    public void testMax() {
        MassiveMathImplementation ms=new MassiveMathImplementation();
        int []test=new int[]{11,12};
        int actual=ms.max(test);
        int expected=12;
        assertEquals(actual,expected);
    }

    @Test
    public void testAverage() {
        MassiveMathImplementation ms=new MassiveMathImplementation();
        int []test=new int[]{12,12};
        double actual=ms.average(test);
        double expected=12;
        assertEquals(actual,expected);
    }

    @Test
    public void testSum() {
        MassiveMathImplementation ms=new MassiveMathImplementation();
        int []test=new int[]{11,12};
        int actual=ms.sum(test);
        int expected=23;
        assertEquals(actual,expected);
    }

    @Test
    public void testNegativeDigits() {
        MassiveMathImplementation ms=new MassiveMathImplementation();
        int []test=new int[]{-11,12};
        long actual=ms.NegativeDigits(test);
        long expected=1;
        assertEquals(actual,expected);
    }

    @Test
    public void testPositiveDigits() {
        MassiveMathImplementation ms=new MassiveMathImplementation();
        int []test=new int[]{-11,12};
        long actual=ms.PositiveDigits(test);
        long expected=1;
        assertEquals(actual,expected);
    }

    @Test
    public void testChangePositiveToOne() {
        MassiveMathImplementation ms=new MassiveMathImplementation();
        int []test=new int[]{-11,12};
        int []actual=ms.ChangePositiveToOne(test);
        int []expected=new int[]{-11,1};
        assertEquals(actual,expected);
    }
}