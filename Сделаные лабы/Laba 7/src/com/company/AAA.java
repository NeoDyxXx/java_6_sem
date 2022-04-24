package com.company;

import com.company.Ex.ExceptionAAA1;
import com.company.Ex.ExceptionAAA2;
import com.company.Ex.ExceptionAAA3;

public class AAA {
    private Integer i;

    public AAA(Integer i) throws ExceptionAAA1
    {
        if (i == null)
            throw new ExceptionAAA1("i is null", 1);
        else
            this.i = i;
    }

    public void methode(int i)
            throws ExceptionAAA2, ExceptionAAA3
    {
        if (i == 0)
            throw new ExceptionAAA2("i is zero value", 2);
        else if (i < 0)
            throw new ExceptionAAA3("i less then zero", 3);
    }
}
