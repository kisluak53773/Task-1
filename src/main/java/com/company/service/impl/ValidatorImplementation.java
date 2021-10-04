package com.company.service.impl;

import com.company.service.Validator;

public class ValidatorImplementation implements Validator {
    @Override
    public boolean Validate(String str) {
        final String STRING_REGX="\\d+[a-z]+";
        boolean result=true;
        ParserImplementation prs=new ParserImplementation();
        String buffer []= prs.Parse(str);
        for(String a:buffer){
            if(a.matches(STRING_REGX)){
                result=false;
            }
        }
        return result;
    }
}
