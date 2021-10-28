package com.company;

//Create a class account with 3 fields, write respective constructor, methods for display withdraw
//and  deposit, create object and invoke the methods by user choice


import java.util.*;
class Account
{
    private int acno;
    private String name;
    private double balance;

    public int getAcno()
    {
        return acno;
    }

    //setter method
    public void setAcno(int acno)
    {
        this.acno=acno;
    }

    public String getname()
    {
        return name;
    }

    public double getbalance()
    {
        return balance;
    }


    public Account(int acno,String name, double balance)
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
}

public class Getter_Setter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name ");
        String nm=sc.nextLine();

        System.out.println("Enter the Account number ");
        int acnum=sc.nextInt();

        System.out.println("Enter the balance ");
        double b=sc.nextDouble();

        Account account1=new Account(acnum,nm,b);

        account1.display();

        System.out.println("Enter your choice (1 for deposit or 2 for withdrawal");
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

        //System.out.println(account1.acno);
        System.out.println("Account no is "+account1.getAcno());

        account1.setAcno(1000);

        System.out.println("Account no is "+account1.getAcno());
    }
}
