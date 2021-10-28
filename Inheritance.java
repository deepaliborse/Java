package com.company;


//inheritance

class A  //superclass
{
    protected int var1;

    //constructor
    A()
    {
        var1=100;
    }
    public void display()
    {
        System.out.println("in A"+ var1);
    }
}

class B extends A  //inheriting A  //reusability   //subclass
{
    int var2;

    B()
    {
        var2=200;
    }

    public void display() //overriding
    {
        System.out.println("var1 "+var1);
        System.out.println("in B"+var2);
    }
}


class Inheritance
{
    public static void main(String args[])
    {
        A aobj=new A();
        aobj.display();

        B bobj=new B();
        bobj.display();

        A aobj1=new B();
        aobj1.display();

        A aobj2;

        aobj2=new B();
        aobj2.display();

        B bobj1=new B();

        aobj2=bobj1;
        aobj2.display();
        System.out.println(aobj.var1);
    }
}

