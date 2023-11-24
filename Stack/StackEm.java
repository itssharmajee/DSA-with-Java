package Stack;
import java.util.Stack;
public class StackEm {
public static void main(String[] args) {
    Stack s=new Stack<>();
    s.push(12);
    s.push(13);
    s.push(34);
    s.push("Sapna");
    System.out.println(s);
    while(!s.isEmpty()){
        //System.out.println(s.peek());
        System.out.println(s.pop());


    }

}
}
