// Print area and Circumference of circle


import java.util.*;

class Question4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Please enter the radius of circle: ");
float radius =  sc.nextFloat();

System.out.println("Area of circle is: " + (3.14*radius*radius));

System.out.println("Circumference of circle is: " + (3.14*2*radius));
}
}
