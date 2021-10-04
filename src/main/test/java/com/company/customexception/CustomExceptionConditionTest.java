package com.company.customexception;

import com.company.custommasive.CustomMassive;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomExceptionConditionTest {

    @Test(expectedExceptions = CustomException.class)
    public void testNewException() throws CustomException {
        CustomMassive cs=new CustomMassive();
        CustomExceptionCondition customExceptionCondition=new CustomExceptionCondition();
        customExceptionCondition.NewException(cs);
    }
}