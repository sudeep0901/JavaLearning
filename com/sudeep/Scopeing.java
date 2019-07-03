package com.sudeep;

public class Scopeing
{
    private int val = 20;
    // System.out.println("I am starting the program");
    {
        System.out.println("I am in initializer block");
        val = 30;
        System.out.println(val);
    }
   
    public Scopeing(){
        System.out.println("I am in constructor");
        val = 40;
        System.out.println(val);
    }

    public int getVal(){
        return val;
    }

}