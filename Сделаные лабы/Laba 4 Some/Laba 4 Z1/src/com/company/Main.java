package com.company;

public class Main {

    public static void main(String[] args) {
        com.company.A.A a = new com.company.A.A(1);
        com.company.A.B.B b = new com.company.A.B.B(2);
        com.company.A.B.B1 b1 = new com.company.A.B.B1(3);
        com.company.A.B.C.D.D d = new com.company.A.B.C.D.D(4);
        com.company.A.B.C.D.D1 d1 = new com.company.A.B.C.D.D1(5);

        a.Print();
        b.Print();
        b1.Print();
        d.Print();
        d1.Print();
    }
}
