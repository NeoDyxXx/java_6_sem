package com.company.A.B;

public class B {
    int a;

    public B(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        System.out.println(this.getClass().getName() + " " + this.a);
    }
}
