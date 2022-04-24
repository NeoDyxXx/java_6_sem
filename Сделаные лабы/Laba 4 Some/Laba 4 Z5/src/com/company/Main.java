package com.company;

import com.company.A.*;
import com.company.A.AA.*;
import com.company.A.AA.AAA.AAAA.*;
import com.company1.B.*;
import com.company1.B.BB.*;
import com.company1.B.BB.BBB.BBBB.*;

public class Main {
    public static void main(String[] args) {
        A a = new A(1);
        AA aa =new AA(2);
        AA1 aa1 = new AA1(3);
        AAAA aaaa = new AAAA(4);
        AAAA1 aaaa1 = new AAAA1(5);
        B b = new B(6);
        BB bb = new BB(7);
        BB1 bb1 = new BB1(8);
        BBBB bbbb = new BBBB(9);
        BBBB1 bbbb1 = new BBBB1(10);

        a.Print();
        aa.Print();
        aa1.Print();
        aaaa.Print();
        aaaa1.Print();
        b.Print();
        bb.Print();
        bb1.Print();
        bbbb.Print();
        bbbb1.Print();
        bbbb.PrintA();

        AExtend aex = new AExtend(0);
        aex.Print();
    }
}
