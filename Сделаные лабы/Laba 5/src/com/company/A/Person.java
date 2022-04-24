package com.company.A;

public interface Person {
    int Limityyyy = 1900;

    void SetSurname(String surname);
    void SetName(String name);
    void SetFatherName(String fatherName);
    void SetBirthday(int yyyy, int mm, int dd);
    String GetSurname();
    String GetName();
    String GetFatherName();
    java.util.Date GetBirthday();
}
