import java.util.*;


class Question11
{

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

System.out.println("Please enter any numbers:");

int i = sc.nextInt();

if (i > 0)
{
System.out.println("Positive Integer!");
}
else if (i < 0)
{
System.out.println("Negative Integer!");
}

else
{
System.out.println("Zero Integer!");
}

}

}
