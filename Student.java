import java.util.*;
import java.lang.*;


class Student
{
int id;
String name;
int age;

Student()
{
id = 100;
name = "Anushka";
age = 18;
}


void input(int sid, String sname, int sage)
{
id = sid;
name = sname;
age = sage;
}

void display()
{
System.out.println("Student ID: " + id);
System.out.println("Student name: " + name);
System.out.println("Student age: " + age);
}

public static void main(String args[])
{
int id, age;
String name;

Scanner sc = new Scanner(System.in);

Scanner str_sc = new Scanner(System.in);

System.out.println("Enter student ID:");
id = sc.nextInt();

System.out.println("Enter student name:");
name = str_sc.nextLine();

System.out.println("Enter student age:");
age = sc.nextInt();

Student s1 = new Student();

System.out.println("\nUser inputs: ");
s1.input(id, name, age);
s1.display();
}
}
















