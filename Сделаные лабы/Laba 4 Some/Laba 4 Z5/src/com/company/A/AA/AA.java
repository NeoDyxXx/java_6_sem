package com.company.A.AA;

public class AA {
    int a;

    public AA(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        System.out.println(this.getClass().getName() + " " + this.a);
    }
}