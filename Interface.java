package com.company;


interface Newspaper
{
    public void news();
}

interface Magazine extends Newspaper
{
    public void colorful();
}

class Interface implements Magazine
{

    public void news()
    {
        System.out.println("it gives news");
    }

    public void colorful()
    {
        System.out.println("it is colorful");
    }

    public static void main(String args[])
    {
        Interface T1=new Interface();
        T1.news();
        T1.colorful();
    }
}

