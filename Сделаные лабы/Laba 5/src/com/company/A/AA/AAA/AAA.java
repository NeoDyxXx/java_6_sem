package com.company.A.AA.AAA;

import com.company.A.AA.Student;
import java.util.Date;
import java.util.GregorianCalendar;

public class AAA implements Student {
    private Date firstDate;
    private Date birthday;
    private String universityName;
    private String firstName;
    private String lastName;
    private String fatherName;

    @Override
    public void SetFirstDate(Date d) {
        firstDate = d;
    }

    @Override
    public Date GetFirstDate() {
        return firstDate;
    }

    @Override
    public void SetUniversity(String u) {
        universityName = u;
    }

    @Override
    public String GetUniversity() {
        return universityName;
    }

    @Override
    public void SetSurname(String surname) {
        lastName = surname;
    }

    @Override
    public void SetName(String name) {
        firstName = name;
    }

    @Override
    public void SetFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public void SetBirthday(int yyyy, int mm, int dd) {
        birthday = new GregorianCalendar(yyyy, mm - 1, dd).getTime();
    }

    @Override
    public String GetSurname() {
        return lastName;
    }

    @Override
    public String GetName() {
        return firstName;
    }

    @Override
    public String GetFatherName() {
        return fatherName;
    }

    @Override
    public Date GetBirthday() {
        return birthday;
    }
}