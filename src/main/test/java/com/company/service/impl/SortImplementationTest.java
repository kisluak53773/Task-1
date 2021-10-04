package com.company.service.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortImplementationTest {

    @Test
    public void testBubbleSort() {
        SortImplementation srt=new SortImplementation();
        int []ints=new int[]{22,11,24};
        int []actual=srt.BubbleSort(ints);
        int []expected=new int[]{11,22,24};
        assertEquals(actual,expected);
    }

    @Test
    public void testSelectionSort() {
        SortImplementation srt=new SortImplementation();
        int []ints=new int[]{22,11,24};
        int []actual=srt.SelectionSort(ints);
        int []expected=new int[]{11,22,24};
        assertEquals(actual,expected);
    }

    @Test
    public void testInsertionSort() {
        SortImplementation srt=new SortImplementation();
        int []ints=new int[]{22,11,24};
        int []actual=srt.InsertionSort(ints);
        int []expected=new int[]{11,22,24};
        assertEquals(actual,expected);
    }
}