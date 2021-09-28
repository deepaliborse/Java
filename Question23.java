//Question23: Replace a specific character with another.

// Solution: Here we will replace as 'a's with '@' sign


import java.lang.*;
import java.util.*;


class Question23
{
public static void main(String args[])
{
System.out.println("Enter any string: ");

Scanner sc = new Scanner(System.in);

String str = sc.nextLine();

String new_str = str.replace("a" , "@");

System.out.println("\nOriginal String: " + str);

System.out.println("\nUpdated String: " + new_str);


}
}
