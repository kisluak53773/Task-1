package com.company.service;

public interface MassiveMath {
    int min(int [] num);
    int max(int[] num);
    double average(int[] num);
    int sum(int [] num);
    long NegativeDigits(int [] num);
    long PositiveDigits(int [] num);
    int [] ChangePositiveToOne(int [] num);
}
