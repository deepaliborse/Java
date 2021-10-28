package com.company;


interface Person1
{
    public String  PersonIdentity();
}

interface Location
{
    public String  LocationIdentity();
}

class Employee implements Person1, Location
{
    String empname;
    String workplace;

    Employee()
    {
        empname="Ashok";
        workplace="CDAC";
    }

    public String PersonIdentity()
    {
        return empname;
    }

    public String LocationIdentity()
    {
        return   "works in " + workplace;
    }

}


class Student3 implements Person1, Location
{
    String stuname;
    String collegename;
    Student3()
    {
        stuname="John";
        collegename="VIT";
    }
    public String PersonIdentity()
    {
        return stuname;
    }
    public String LocationIdentity()
    {
        return "Studies in "+collegename;
    }
}

class MultipleInheritance
{
    public static void main(String args[])

    {
        Student3 s=new Student3();
        System.out.println(s.PersonIdentity());
        System.out.println(s.LocationIdentity());

        Employee e=new Employee();
        System.out.println(e.PersonIdentity());
        System.out.println(e.LocationIdentity());
    }
}
