package com.company;

import com.company.A.AA.AAA.AAA;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        AAA a = new AAA();
        a.SetBirthday(2002, 7,4);
        a.SetName("Kirill");
        a.SetSurname("Kraynov");
        a.SetFatherName("Andreevich");
        a.SetUniversity("BSTU");
        a.SetFirstDate(new Date(123434234L));

        System.out.println(a.GetName());
        System.out.println(a.GetSurname());
        System.out.println(a.GetFatherName());
        System.out.println(a.GetBirthday());
        System.out.println(a.GetUniversity());
        System.out.println(a.GetFirstDate());
    }
}
