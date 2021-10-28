//Apply and practise lamda expression for a linked list traversal.
import java.util.*;
class asslast{
    public static void main(String args[]){
        LinkedList<Integer> data = new LinkedList<Integer>();
        data.add(45);
        data.add(42);
        data.add(46);
        data.add(43);
        data.add(47);
        data.forEach(n->{
            System.out.println(n);
        });
    }
}

