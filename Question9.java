import java.util.*;

class Question9
{

public static void main(String args[])
{

Scanner input=new Scanner(System.in);

System.out.print("Enter a String/Sentence: ");

String str=input.nextLine();
int letter=0,space=0,digit=0,other=0;
char ch[]=str.toCharArray();

for(int i=0;i<str.length();i++)
{

if(Character.isLetter(ch[i]))
{
letter++;
}

else if(Character.isDigit(ch[i]))
{
digit++;
}

else if(Character.isSpaceChar(ch[i]))
{
space++;
}

else
{
other++;
}
}

System.out.println("\nLetter count\t: \t"+letter);
System.out.println("Space count\t: \t"+space);
System.out.println("Digit count\t: \t"+digit);
System.out.println("Special character count: "+other);    
  
}

}
