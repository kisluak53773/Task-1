package com.company.customexception;

import com.company.custommasive.CustomMassive;

public class CheckMassive {
    public static void Check(CustomMassive cs) throws MassiveIsEmptyException {
        if((cs.getMas())==null ){
            throw new MassiveIsEmptyException();
        }
    }
}
