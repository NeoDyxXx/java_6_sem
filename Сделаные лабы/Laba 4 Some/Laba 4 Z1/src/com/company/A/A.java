package com.company.A;

public class A {
    int a;

    public A(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        System.out.println(this.getClass().getName() + " " + this.a);
    }
}
