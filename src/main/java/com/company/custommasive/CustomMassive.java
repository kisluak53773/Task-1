package com.company.custommasive;

public class CustomMassive {
    private int [] mas;

    public CustomMassive(){
    }
    public CustomMassive(int[] mas){
        this.mas=mas;
    }
    public void setMas(int[] mas){
        this.mas=mas;
    }

    public int[] getMas(){
        int []copy=mas;
        return copy;
    }

    public String ToStr(){
        StringBuilder sb=new StringBuilder();
        for(int num:mas){
            sb.append(sb).append("\s");
        }
        return sb.toString();
    }
}
