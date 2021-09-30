package com.company.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class MassiveService {
    public int min(int [] num){
        IntStream intStream= Arrays.stream(num);
        return intStream.min().getAsInt();
    }

    public int max(int[] num){
        IntStream intStream= Arrays.stream(num);
        return intStream.max().getAsInt();
    }

    public double average(int[] num){
        IntStream intStream= Arrays.stream(num);
        return intStream.average().getAsDouble();
    }

    public int sum(int [] num){
        IntStream intStream= Arrays.stream(num);
        return intStream.sum();
    }

    public long NegativeDigits(int [] num){
        int i=0;
        IntStream intStream= Arrays.stream(num);
        return intStream.filter(n-> n<0).count();
    }
    public long PositiveDigits(int [] num){
        int i=0;
        IntStream intStream= Arrays.stream(num);
        return intStream.filter(n-> n>0).count();
    }

    public int [] ChangePositiveToOne(int [] num){
        for (int i=0;i<num.length;i++){
            if(num[i]>0){
                num[i]=1;
            }
        }
        return num;
    }
}
