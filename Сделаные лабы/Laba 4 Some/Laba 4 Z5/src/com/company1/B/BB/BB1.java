package com.company1.B.BB;



public class BB1 {
    int a;

    public BB1(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        System.out.println(this.getClass().getName() + " " + this.a);
    }
}
