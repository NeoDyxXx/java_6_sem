package com.company.A.AA.AAA.AAAA;

public class AAAA1 {
    int a;

    public AAAA1(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        System.out.println(this.getClass().getName() + " " + this.a);
    }
}
