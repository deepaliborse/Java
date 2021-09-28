// Question 15: Find n term of odd numbers and their sum.



import java.util.*;


class Question15
{
public static void main(String args[])
{
int i, n=0, sum=0;

Scanner sc = new Scanner(System.in);

System.out.println("Insert the maximum limit: ");

n = sc.nextInt();

System.out.println("\nOdd numbers between 1 to "+n+" are:");

for(i=0; i<=n; i++)
{
if(i % 2 != 0)
{
System.out.println(i+",");
sum+=i;
}
}
System.out.println("\nAddition of odd numbers between 1 to "+n+" is: "+sum);

}
}
