package com.company1.B;

import com.company.A.A;

public class B {
    int a;

    public B(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        A a = new A(1);
        System.out.println(this.getClass().getName() + " " + this.a);
        a.Print();
    }
}