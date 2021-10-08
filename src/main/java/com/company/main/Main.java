package com.company.main;

import com.company.filereader.ReadFromFile;
import com.company.service.impl.StringConversionImplementation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.net.URISyntaxException;

public class Main {
    private final static Logger logger=LogManager.getLogger();
    public static void main(String[] args) throws URISyntaxException {
       File file=new File(Thread.currentThread().getContextClassLoader().getResource("data/info.txt").toURI());
       StringConversionImplementation cnv=new StringConversionImplementation();
       String str=ReadFromFile.read(file);
       logger.info(str);
    }
}
