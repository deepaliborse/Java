package com.company;

//Program for multilevel inheritance
import java.util.*;

class Person
{
    int id;
    String name;
    Person(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void displayvaluesPerson()
    {
        System.out.println("Id is "+id);
        System.out.println("Name is "+name);
    }
}


class Student extends Person
{
    String collegename;
    int duration;
    Student(int id,String name, String collegename,int duration)
    {
        super(id,name);
        this.collegename=collegename;
        this.duration=duration;
    }
    void displayvalues()
    {
        displayvaluesPerson();
        System.out.println("Collegename is "+collegename);
        System.out.println("Duration of study is "+duration);
    }
}


class Pgstudent extends Student
{
    String specialisation;
    Pgstudent(int id,String name, String collegename,int duration,String specialisation)
    {
        super( id, name,  collegename, duration);
        this.specialisation=specialisation;
    }
    void displayvalues()
    {
        super.displayvalues();
        System.out.println("Specialisation is "+specialisation);
    }
}

class Multilevel_Inheritance
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter Id");
        int id=sc.nextInt();

        System.out.println("Enter Name");
        String name=sc.next();

        System.out.println("Enter collegename");
        String collegename=sc.next();

        System.out.println("Enter Duration");
        int duration=sc.nextInt();

        System.out.println("Enter Specialisation");
        String spec=sc.next();

        Pgstudent pgobj=new Pgstudent(id,name,collegename,duration,spec);

        pgobj.displayvalues();
    }
}
