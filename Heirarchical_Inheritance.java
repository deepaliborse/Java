package com.company;

//Program for hierarchical inheritance


class Hostel
{
    String hostelname;
    Hostel()
    {
        hostelname="Sunshine";
    }
}

class Student1 extends Hostel
{
    String collegename;
    Student1()
    {
        collegename="ABC";
    }
}

class Heirarchical_Inheritance extends Hostel
{
    String Designation;
    Heirarchical_Inheritance()
    {
        Designation="Manager";
    }

    public static void main(String args[])
    {
        Heirarchical_Inheritance e=new Heirarchical_Inheritance();
        Student1 s=new Student1();
        System.out.println(e.hostelname);
        System.out.println(e.Designation);
        System.out.println(s.hostelname);
        System.out.println(s.collegename);
    }
}
