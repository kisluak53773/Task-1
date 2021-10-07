package com.company.customexception;

import com.company.custommasive.CustomMassive;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckMassiveTest {

    @Test(expectedExceptions = MassiveIsEmptyException.class)
    public void testCheck() throws MassiveIsEmptyException {
        CustomMassive cs=new CustomMassive();
        CheckMassive.Check(cs);
    }
}