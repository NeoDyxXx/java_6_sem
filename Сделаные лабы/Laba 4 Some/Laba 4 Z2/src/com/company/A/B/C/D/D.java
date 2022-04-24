package com.company.A.B.C.D;

public class D {
    int a;

    public D(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        System.out.println(this.getClass().getName() + " " + this.a);
    }
}
