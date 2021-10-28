package com.company;

//Program interface with default method and static variables


interface interface1
{
    void methodA();
    void methodB();
    default void display()
    {
        System.out.println("This is non abstract method of interface");
    }

    static public final int incrementvalue=0;

}

class classA implements interface1
{
    static int incrementvalue1=0;
    int incrementvalue2;
    classA()
    {
        ++incrementvalue1;
        ++incrementvalue2;
    }
    public void methodA()
    {
        System.out.println("This is overridden methodA");
    }
    public void methodB()
    {
        System.out.println("This is overridden methodB");
    }
}

class Interface_DefaultMethod
{
    public static void main(String args[])
    {
        interface1 obj=new classA();

        obj.methodA();
        obj.methodB();
        obj.display();
        System.out.println("Interface static value "+interface1.incrementvalue);

        classA obj1=new classA();

        System.out.println("class static value "+classA.incrementvalue1);
        System.out.println("class non static value "+obj1.incrementvalue2);

        classA obj2=new classA();

        System.out.println("class static value "+classA.incrementvalue1);
        System.out.println("class non static value "+obj2.incrementvalue2);
    }
}
