import java.util.*;
import java.lang.*;


class Employee
{
int id;
String name;
int age;

int joining_year;
String position;
String department;

Employee()
{
id = 100;
name = "Deepali";
age = 24;
joining_year = 2021;
position = "Intern";
department = "IT";
}


void personal_details(int sid, String sname, int sage)
{
id = sid;
name = sname;
age = sage;

System.out.println("ID: " + id);
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}

void professional_details(int j_year, String pos, String dept)
{
joining_year = j_year;
position = pos;
department = dept;

System.out.println("Joining Year: " + joining_year);
System.out.println("Position: " + position);
System.out.println("Department: " + department);
}

public static void main(String args[])
{
int id, age, joining_year;
String name, position, department;

Scanner sc = new Scanner(System.in);

Scanner str_sc = new Scanner(System.in);

System.out.println("Enter Employee ID:");
id = sc.nextInt();

System.out.println("Enter Employee name:");
name = str_sc.nextLine();

System.out.println("Enter Employee age:");
age = sc.nextInt();

System.out.println("Enter Employee Joining Year:");
joining_year = sc.nextInt();

System.out.println("Enter Employee position:");
position = str_sc.nextLine();

System.out.println("Enter Employee department:");
department = str_sc.nextLine();


Employee s1 = new Employee();

System.out.println("\nUser inputs: ");

System.out.println("\nEmployee's Personal details:");
s1.personal_details(id, name, age);


System.out.println("\nEmployee's Professional details:");
s1.professional_details(joining_year,position, department);
}
}
















