package com.company.parser;

import com.company.parser.impl.ParserImplementation;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParserImplementationTest {

    @Test
    public void testParse() {
        ParserImplementation prs=new ParserImplementation();
        String str="12 14";
        String []actual= prs.Parse(str);
        String []expected=new String[]{"12","14"};
        assertEquals(actual,expected);
    }
}