package com.company.service.impl;

import com.company.service.Sort;

public class SortImplementation implements Sort {
    @Override
    public int[] BubbleSort(int[] ints) {
        boolean iteration=true;
        while (iteration){
            iteration=false;
            for (int i=1;i<ints.length;i++){
                if(ints[i]<ints[i-1]){
                   int buffer= ints[i];
                   ints[i]=ints[i-1];
                   ints[i-1]=buffer;
                   iteration=true;
                }
            }
        }
        return ints;
    }

    @Override
    public int[] SelectionSort(int[] ints) {
        for(int ind=0;ind<ints.length;ind++){
            int min=ind;
            for(int i=min;i<ints.length;i++){
                if(ints[i]<ints[min]){
                    min=i;
                }
            }
            if(min!=ind){
                int buffer=ints[ind];
                ints[ind]=ints[min];
                ints[min]=buffer;
            }
        }
        return ints;
    }

    @Override
    public int[] InsertionSort(int[] ints) {
      for(int i=1;i<ints.length;i++){
          int current=ints[i];
          int a=i;
          while (a>0 && ints[a-1]>current){
              ints[a]=ints[a-1];
              a--;
          }
          ints[a]=current;
      }
      return ints;
    }
}
