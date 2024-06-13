import java.util.ArrayList;

public class Practice_on_stack {
    static class Stack{
        public static int size;
        static ArrayList<Integer> list = new ArrayList<>();


        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }
        
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }

        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(16);
        st.push(17);

        while (st.isEmpty()) {
            System.out.print(st.peek());
            st.pop();
        }
    }
}
