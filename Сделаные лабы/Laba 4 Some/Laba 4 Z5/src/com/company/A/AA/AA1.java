package com.company.A.AA;

public class AA1 {
    int a;

    public AA1(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        System.out.println(this.getClass().getName() + " " + this.a);
    }
}
