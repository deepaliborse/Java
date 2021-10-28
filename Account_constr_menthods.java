package com.company;

//Create a class account with 3 fields, write respective constructor, methods for display withdraw
//and  deposit, create object and invoke the methods by user choice


import java.util.*;
public class Account_constr_menthods
{
    private int acno;
    private String name;
    private double balance;

    public Account_constr_menthods(int acno,String name, double balance)
    {
        this.acno=acno;
        this.name=name;
        this.balance=balance;
    }

    public void display()
    {
        System.out.println("Acno "+acno);
        System.out.println("Name "+name);
        System.out.println("Balance "+balance);
    }

    public void deposit(double amt)
    {
        balance+=amt;
    }
    public void withdraw(double amt)
    {
        balance-=amt;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name ");
        String nm=sc.nextLine();
        System.out.println("Enter the Account number ");
        int acnum=sc.nextInt();
        System.out.println("Enter the balance ");
        double b=sc.nextDouble();

        Account_constr_menthods account1=new Account_constr_menthods(acnum,nm,b);

        account1.display();

        System.out.println("Enter your choice (1 for deposit or 2 for withdrawal)");
        int choice=sc.nextInt();

        System.out.println("Enter the transaction amount");
        double amount=sc.nextDouble();

        if (choice==1)
            account1.deposit(amount);
        else if (choice ==2)
            account1.withdraw(amount);
        else
            System.out.println("Invalid input");

        account1.display();
    }
}
