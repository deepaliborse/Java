import java.util.*;

class Question12
{
public static void main(String args[])
{
double a, b, c, d, r, r1, r2;

System.out.println("Enter values of a, b, c: ");

Scanner sc = new Scanner(System.in);
a = sc.nextFloat();
b = sc.nextFloat();
c = sc.nextFloat();


d = b*b-4.0*a*c;

r = b/2.0*a;

if(d > 0)
{
 r1 = (-b + (Math.pow(d, 0.5)))/(2.0*a);
 r2 = (-b - (Math.pow(d, 0.5)))/(2.0*a);

System.out.println("\nRoots of equation are real!");
System.out.println("\nFirst root: " +r1+ "\nSecond root: "+ r2 +"\n");
}

else if(d == 0)
{
r1 = -r ;
System.out.println("Roots of equation are real and same:");
System.out.println("First and Second root: " + r1);
}

else
{
d = -d;
double im_r = Math.pow(d, 0.5)/2.0*a;
System.out.print("\nRoots are imaginary!");
System.out.println("\nFirst root: " +(r+im_r)+ "\nSecond root: "+ (r-im_r) +"\n");
}

}
}





















