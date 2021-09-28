// Question: Add, subtract, multiply and divide int and float values:




import java.util.*;


class Question1
{
public static void main(String args[])
{

int x=13, y=2, result1 = 0;

float a=1.5f, b=2.0f, result2 = 0;

System.out.println(" Welcome! \n\n What would you like to do? : \n\nAddition --> 1 \nSubtraction --> 2  \nMultiplication --> 3 \nDivision --> 4");

Scanner sc = new Scanner(System.in);

System.out.println("\nEnter Your Choice:");
int choice = sc.nextInt();



switch(choice)
{

case 1 :
System.out.println("Addition of integer numbers is: " + (x+y));
System.out.println("Addition of float numbers is: " + (a+b));
break;

case 2 :
System.out.println("Subtraction of integer numbers is: " + (x-y));
System.out.println("Subtraction of float numbers is: " + (a-b));
break;

case 3 :
System.out.println("Multiplication of integer numbers is: " + (x*y));
System.out.println("Multiplication of float numbers is: " + (a*b));
break;

case 4 :
System.out.println("Division of integer numbers is: " + (x/y));
System.out.println("Division of float numbers is: " + (a/b));
break;

default:
System.out.println("Invalid Choice! \nOutside Switch case!");
break;
}


}
}
