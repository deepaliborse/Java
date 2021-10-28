package com.company;

//Program (Polymorphism)


import java.util.*;
class Shape
{
    double area;
    double PI=3.14;
    public double area()
    {
        return area;
    }
}

class Circle extends Shape
{
    double radius;

    Circle()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        radius=sc.nextDouble();
    }

    public double area()
    {
        area=PI*radius*radius;
        return area;
    }

}

class Rectangle extends Shape
{
    double length;
    double width;

    Rectangle()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        length=sc.nextDouble();
        System.out.println("enter the width of rectangle");
        width=sc.nextDouble();
    }

    public double area()
    {
        area=length*width;
        return area;
    }

}

class Triangle extends Shape
{
    double breadth;
    double height;
    Triangle()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the breadth of triangle");
        breadth=sc.nextDouble();
        System.out.println("enter the width of triangle");
        height=sc.nextDouble();

    }

    public double area()
    {
        area=0.5*breadth*height;
        return area;
    }
}

class Polymorphism
{
    public static void main(String args[])
    {
        Shape s=new Shape();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice(1 for Circle, 2 for Rectangle, 3 for Triangle");

        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("You choose circle");
                Circle c=new Circle();
                s=c;   //s is the object of shape class
                break;
            case 2:
                System.out.println("You choose rectangle");
                Rectangle r=new Rectangle();
                s=r;        //s is the object of shape class
                break;
            case 3:
                System.out.println("You choose triangle");
                Triangle t=new Triangle();
                s=t;        //s is the object of shape class
                break;
            default:
                System.out.println("Invalid input");
        }

        double areaoutput=s.area();

        System.out.println("Area of the shape is "+areaoutput);

        System.out.println("Area of the shape is "+s.area());
    }
}
