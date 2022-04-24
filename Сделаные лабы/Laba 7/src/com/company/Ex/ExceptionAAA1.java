package com.company.Ex;

public class ExceptionAAA1 extends Exception{
    private int i;

    public ExceptionAAA1(String msg, int i)
    {
        super(msg);
        this.i = i;
    }
}
