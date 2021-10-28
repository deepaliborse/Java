//Write a program for getting integer and string input and write those values into a text file.


import java.io.*;
class Studentinfo implements java.io.Serializable
{
    String name;
    int rid;
    Studentinfo(String n, int r)
    {
        this.name = n;
        this.rid = r;
    }
}
class Demo2
{
    public static void main(String[] args)
    {
//serialization
        try
        {
            Studentinfo si = new Studentinfo("Deepali", 100);
            FileOutputStream fos = new FileOutputStream("E:/InteliJ/JavaExam/src/test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.flush();
            oos.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
//deserialization
        Studentinfo si=null ;
        try
        {
            FileInputStream fis = new FileInputStream("E:/InteliJ/JavaExam/src/test.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            si = (Studentinfo)ois.readObject();
        }
        catch (Exception e)
        {
            e.printStackTrace(); }
        System.out.println(si.name);
        System.out. println(si.rid);
    }
}


