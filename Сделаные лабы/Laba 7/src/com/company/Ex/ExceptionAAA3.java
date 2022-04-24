package com.company.Ex;

public class ExceptionAAA3 extends Exception{
    private int i;

    public ExceptionAAA3(String msg, int i)
    {
        super(msg);
        this.i = i;
    }
}
