package com.company.service.impl;

import com.company.service.StringConversion;

import java.util.ArrayList;

public class StringConversionImplementation implements StringConversion {
    @Override
    public int[] Convert(String str) {
        ParserImplementation prs=new ParserImplementation();
        String []buffer=prs.Parse(str);
        ArrayList<Integer> ints=new ArrayList<>();
        for(String a:buffer){
            ints.add(Integer.parseInt(a));
        }
        int result[]=new int[ints.size()];
        for(int i=0;i<ints.size();i++){
            result[i]=ints.get(i);
        }
        return result;
    }
}
