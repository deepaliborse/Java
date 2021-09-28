import java.lang.*;
import java.io.*;
import java.util.*;

class Question8 

{
public static void main(String[] args)
{
String input = "CDAC CHENNAI !";
char[] temparray = input.toCharArray();
int left, right = 0;
right = temparray.length - 1;

for (left = 0; left < right; left++, right--) 

{

char temp = temparray[left];
temparray[left] = temparray[right];
temparray[right] = temp;

}

System.out.println("Original String:\n"+input+"\n");

System.out.println("Reversed String:");

for (char c : temparray)

System.out.print(c);
System.out.println();

}
}

