package com.company.service.impl;

import com.company.service.MassiveMath;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MassiveMathImplementation implements MassiveMath {
    @Override
    public int min(int [] num){
        IntStream intStream= Arrays.stream(num);
        return intStream.min().getAsInt();
    }

    @Override
    public int max(int[] num){
        IntStream intStream= Arrays.stream(num);
        return intStream.max().getAsInt();
    }

    @Override
    public double average(int[] num){
        IntStream intStream= Arrays.stream(num);
        return intStream.average().getAsDouble();
    }

    @Override
    public int sum(int [] num){
        IntStream intStream= Arrays.stream(num);
        return intStream.sum();
    }

    @Override
    public long NegativeDigits(int [] num){
        IntStream intStream= Arrays.stream(num);
        return intStream.filter(n-> n<0).count();
    }

    @Override
    public long PositiveDigits(int [] num){
        IntStream intStream= Arrays.stream(num);
        return intStream.filter(n-> n>0).count();
    }

    @Override
    public int [] ChangePositiveToOne(int [] num){
        for (int i=0;i<num.length;i++){
            if(num[i]>0){
                num[i]=1;
            }
        }
        return num;
    }
}
