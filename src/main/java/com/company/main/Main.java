package com.company.main;

import com.company.service.MassiveService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private final static Logger logger=LogManager.getLogger();
    public static void main(String[] args) {
        int [] ints={15,-14,22,44,-49};
        MassiveService ms=new MassiveService();
        logger.info(ms.max(ints));
        logger.info(ms.min(ints));
        logger.info(ms.average(ints));
        logger.info(ms.sum(ints));
        ints=ms.ChangePositiveToOne(ints);
        for(int a:ints){
            logger.info(a);
        }
    }
}
