package com.company;

class MyException extends Exception
{
    String s;
    MyException(String str)
    {
        s=str;
    }
    public String toString()
    {
        return(s);
    }

}

class TestCustomExcption
{
    public static void main(String args[])
    {
        try
        {
//get a number
//check a condition with that number  mark<40
            throw new MyException("My own exception");
//else display some msg (pass)
        }
        catch(MyException ex)
        {
            System.out.println(ex);
        }
//add a finally block
    }
}

