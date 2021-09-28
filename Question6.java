// Take 3 numbers as input to calculate and print their average.


import java.util.*;


class Question6
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("Please enter any 3 numbers:");

int num1 = sc.nextInt();
int num2 = sc.nextInt();
int num3 = sc.nextInt();

float average = 0.00f;

average = (num1+num2+num3)/3;

System.out.println("Average of three numbers is: " + average);

}

}
