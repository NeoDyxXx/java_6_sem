package com.company1.B.BB.BBB.BBBB;

import com.company.A.AA.AAA.AAAA.AAAA;

public class BBBB {
    int a;

    public BBBB(int a)
    {
        this.a = a;
    }

    public void Print()
    {
        System.out.println(this.getClass().getName() + " " + this.a);
    }

    public void PrintA()
    {
        AAAA a = new AAAA(4);
        a.Print();
    }
}
