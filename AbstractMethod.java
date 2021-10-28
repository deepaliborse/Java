package com.company;

abstract class Abst
{
    abstract void display();

}

class AbstractMethod extends Abst
{
    void display()
    {
        System.out.println("Welcome");
    }

    public static void main(String args[])
    {
        Abst a1;

        AbstractMethod b1=new AbstractMethod();

        System.out.println(b1);

        a1=b1;
        a1.display();
        b1.display();

        System.out.println(a1);
    }
}


interface I1
{
    public void methodA();
}


class A1 implements I1
{
    public void methodA()
    {
        System.out.println("Overridden method");
    }
    void methodB()
    {
        System.out.println("Its own method");
    }
}
