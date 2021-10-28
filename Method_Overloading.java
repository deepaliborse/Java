package com.company;

//method overloading


import java.util.*;
class Method_Overloading
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("Enter the value of c:");
        int c=sc.nextInt();
        System.out.println("Enter the value of d:");
        double e=sc.nextDouble();
        System.out.println("Enter the value of e:");
        double d=sc.nextDouble();
        add(a);
        add(a,b);
        add(a,b,c);
        add(e,b,d);
    }

    static void add(int var1)
    {
        System.out.println("Inside 1st method");
        var1+=10;
        System.out.println(var1);
    }

    static void add(int var1,int var2)
    {
        System.out.println("Inside 2nd method");
        var1=var1+var2;
        System.out.println(var1);
    }

    static void add(int var1,int var2,int var3)
    {
        System.out.println("Inside 3rd method");
        var1=var2*var3;
        System.out.println(var1);
    }
    static void add(double var1,int var2,double var3)
    {
        System.out.println("Inside 4th method");
        var1=var2*var3;
        System.out.println(var1);
    }
}
