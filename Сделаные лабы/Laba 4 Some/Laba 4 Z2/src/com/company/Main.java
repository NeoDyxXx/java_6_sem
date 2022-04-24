package com.company;

import com.company.A.*;
import com.company.A.B.C.D.*;

public class Main {

    public static void main(String[] args) {
        // com.company.A.A a = new com.company.A.A(1);
        A a = new A(1);

        com.company.A.B.B b = new com.company.A.B.B(2);
        // B b = new B(2);

        com.company.A.B.B1 b1 = new com.company.A.B.B1(3);
        // B1 b1 = new B1(3);

        D d = new D(4);
        D1 d1 = new D1(5);

        a.Print();
        b.Print();
        b1.Print();
        d.Print();
        d1.Print();
    }
}
