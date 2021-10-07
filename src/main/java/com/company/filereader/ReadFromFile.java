package com.company.filereader;


import com.company.validator.impl.ValidatorImplementation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class ReadFromFile {
    private final static Logger logger= LogManager.getLogger();
    public static String read(File path){
        String str ="";
        boolean check=false;
        ValidatorImplementation val=new ValidatorImplementation();
        try(FileReader reader=new FileReader(path);
            BufferedReader bufferedReader=new BufferedReader(reader)){
            while (check==false){
                str=bufferedReader.readLine();
                check= val.Validate(str);
            }
        } catch (FileNotFoundException e) {
            logger.error("File not found");
        } catch (IOException e) {
            logger.error("IOException");
        }
        return str;
    }
}
