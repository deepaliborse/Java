package com.company;


import java.io.*;
class IO_Classes
{
    public static void main(String args[]) //throws IOException
    {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter string");
            char c=(char)br.read();
            System.out.println(c);

            //String s=br.readLine();
            //System.out.println(s);
        }
        catch(IOException ie)
        {
            ie.printStackTrace();
        }
    }
}
