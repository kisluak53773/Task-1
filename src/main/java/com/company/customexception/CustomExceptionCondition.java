package com.company.customexception;

import com.company.custommasive.CustomMassive;

public class CustomExceptionCondition {
    public static void NewException(CustomMassive cs) throws CustomException {
        if((cs.getMas())==null ){
            throw new CustomException();
        }
    }
}
