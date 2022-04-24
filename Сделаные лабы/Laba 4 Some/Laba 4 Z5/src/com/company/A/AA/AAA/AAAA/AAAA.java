package com.company.A.AA.AAA.AAAA;

public class AAAA {
    int a;

    public AAAA(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        System.out.println(this.getClass().getName() + " " + this.a);
    }
}
