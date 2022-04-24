package com.company;

public class Main {

    public static void main(String[] args) {
        CCC c = new CCC();
        CCC c1 = new CCC(5, 4);

        System.out.println(c.sum());
        System.out.println(c1.sum());
        System.out.println(CCC.ssub(5, 4));

        System.out.println("----------------------------------");

        DDD d = new DDD();
        DDD d1 = new DDD(5, 4);

        System.out.println(d.info());
        System.out.println(d1.info());
        System.out.println(d.sum());
        System.out.println(d1.sum());
        System.out.println(d.calc());
        System.out.println(d1.calc());
    }
}
