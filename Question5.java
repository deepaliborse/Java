import java.util.*;

class Question5
{
public static void main(String args[])

{
int num1, num2; 

Scanner sc = new Scanner(System.in);
System.out.println("Enter any two numbers: ");

num1 = sc.nextInt();

num2 = sc.nextInt();

if(num1 > num2)
{
System.out.println("\n" + num1+" is greater than "+num2);
}

else if(num1 < num2)
{
System.out.println("\n" + num1+" is smaller than "+num2);
}

else
{
System.out.println("\n" +num1+" is equal to "+num1);
}

}
}







