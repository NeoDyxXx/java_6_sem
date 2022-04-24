package com.company.A.B.C.D;

public class D1 {
    int a;

    public D1(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        System.out.println(this.getClass().getName() + " " + this.a);
    }
}
