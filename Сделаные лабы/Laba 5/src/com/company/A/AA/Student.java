package com.company.A.AA;

import com.company.A.Person;
import java.util.Date;

public interface Student extends Person {
    void SetFirstDate(Date d);
    Date GetFirstDate();
    void SetUniversity(String u);
    String GetUniversity();
}
