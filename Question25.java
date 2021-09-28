//Find the number of days in a month

import java.util.Scanner;


public class Question25
{
public static void main(String args[])
{
int month;

System.out.println("Enter the number of month: ");

Scanner sc = new Scanner(System.in);

month = sc.nextInt();

switch(month)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
System.out.println("\nThis month has 31 days!");
break;

case 4:
case 6:
case 9:
case 11:
System.out.println("\nThis month has 30 days!");
break;

case 2:
System.out.println("\nIn case of Non-leap year this month has 28 days!");

System.out.println("\nIn case of leap year this month has 29 days!");
break;

default:

System.out.println("\nInvalid month!");
}
}
}
















