//Write a program to create an arraylist of String objects , iterated thru the list to find out whether a specific element is present or not.
import java.util.*;
public class q14{
    public static void main(String args[]){
        ArrayList<String> data = new ArrayList<String>();
        data.add("Hello");
        data.add("everyone");
        data.add("how are");
        data.add("you all");
        data.add("doing?");
        Iterator itr = data.iterator();
        if(data.contains("everyone")){
            System.out.println("\n"+data +"\nThe String is Present");
        }
        else{
            System.out.println("\nNot present");
        }
    }
}
