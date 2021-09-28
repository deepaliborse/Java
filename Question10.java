// Take a number from user and print it's multiplication upto 10. 


import java.util.*;


class Question10
{

public static void main(String args[])
{

int i, j, result=0;

Scanner sc = new Scanner(System.in);

System.out.println("Please enter any numbers:");

i = sc.nextInt();

System.out.println("Multiplication table of "+ i + ":");

for(j=1;j<=10;j++)
{
result = i*j;

System.out.println(i+"*"+j+" = "+result);

}

}
}
