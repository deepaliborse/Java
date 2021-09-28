// Question 7 : Chack whether java is installed on your machine or not.

class Question7
{
public static void main(String args[])
{
String java=System.getProperty("java.version");

if(java==null)
{
System.out.println("Java is not installed");
}
else
{
System.out.println("Java is installed!");
System.out.println("\nCurrent version of Java: "+java);
}

}
}
