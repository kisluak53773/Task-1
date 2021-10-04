package com.company.main;

import com.company.filereader.ReadFromFile;
import com.company.service.impl.StringConversionImplementation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class Main {
    private final static Logger logger=LogManager.getLogger();
    public static void main(String[] args) {
       File file=new File("src/main/resources/data/info.txt");
        StringConversionImplementation cnv=new StringConversionImplementation();
        String str=ReadFromFile.read(file);
        int []ints=cnv.Convert(str);
    }
}
