// Question 17: Calculate average of elements of array


import java.util.*;

class Question17
{
public static void main(String args[])
{
double total=0, average=0;
 
Scanner sc = new Scanner(System.in);

System.out.println("Please enter size of array:");
int size = sc.nextInt();

//Putting elements in array

int array[] = new int[size];

System.out.println("\nPlease enter elements of array:");
for(int i=0; i<size; i++)
{
array[i] = sc.nextInt();
total += array[i];
}

average = total/size;
//Average of array
System.out.println("Average of array elements: " + average);

}
}








