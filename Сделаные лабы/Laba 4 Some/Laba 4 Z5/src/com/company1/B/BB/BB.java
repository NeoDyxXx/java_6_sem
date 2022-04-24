package com.company1.B.BB;

import com.company.A.AA.AA;

public class BB {
    int a;

    public BB(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        AA aa = new AA(2);
        System.out.println(this.getClass().getName() + " " + this.a);
        aa.Print();
    }
}
