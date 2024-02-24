package LinkedList;
import java.util.LinkedList;
import java.util.*;
public class LinkedListF {
    public static void main(String[] args) {
        LinkedList<Integer> s =new LinkedList<>();
        s.addFirst(12);
        s.addFirst(23);
        s.addLast(23);
        s.addLast(20);


        System.out.println(s);
        s.remove();
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(" ");
        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
