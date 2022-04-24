package com.company;

import com.company.Ex.ExceptionAAA1;
import com.company.Ex.ExceptionAAA2;
import com.company.Ex.ExceptionAAA3;

public class Main {

    public static void main(String[] args) {
        try
        {
            AAA a = new AAA(null);
        }
        catch (ExceptionAAA1 ex1)
        {
            System.out.println(ex1.getMessage());
            System.out.println(ex1.getStackTrace());
        }

        try
        {
            AAA a = new AAA(0);
            a.methode(0);
        }
        catch (ExceptionAAA2 ex2)
        {
            System.out.println(ex2.getMessage());
            System.out.println(ex2.getStackTrace());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

        try
        {
            AAA a = new AAA(0);
            a.methode(-1);
        }
        catch (ExceptionAAA3 ex3)
        {
            System.out.println(ex3.getMessage());
            System.out.println(ex3.getStackTrace());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}
