package com.company.A.B;

public class B1 {
    int a;

    public B1(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        System.out.println(this.getClass().getName() + " " + this.a);
    }
}
