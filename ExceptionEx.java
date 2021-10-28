package com.company;


class ExceptionEx
{
    public static void main(String args[])
    {
        try
        {
            int arr[]={12,34,54,34};
//System.out.println(arr[9]);
            int num=100/0;
//String year="hello";
//int yr=Integer.parseInt(year);

            throw new Exception("explicit thrown");

        }
        catch(ArrayIndexOutOfBoundsException ex1)
        {
            System.out.println("Error in Array index");
        }
        catch(NumberFormatException ex1)
        {
            System.out.println("Number format is wrong");
        }
        catch(ArithmeticException ex1)
        {
            System.out.println("Divide by Zero");
        }
        catch(Exception ex1)
        {
            System.out.println("thrown exception");
            System.out.println(ex1.getMessage());
        }

        finally
        {
            System.out.println("Try is done");
        }
    }
}
