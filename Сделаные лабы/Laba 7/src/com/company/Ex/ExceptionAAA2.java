package com.company.Ex;

public class ExceptionAAA2 extends Exception{
    private int i;

    public ExceptionAAA2(String msg, int i)
    {
        super(msg);
        this.i = i;
    }
}
