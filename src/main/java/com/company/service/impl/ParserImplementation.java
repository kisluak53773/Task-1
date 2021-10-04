package com.company.service.impl;

import com.company.service.Parser;

public class ParserImplementation implements Parser {

    @Override
    public String[] Parse(String str) {
        final String CHECK_REGEX="\s";
        str=str.trim();
        String[] result=str.split(CHECK_REGEX);
        return result;
    }
}
