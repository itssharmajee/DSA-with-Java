// Implementation of java comaparable interface 
package compare_methods;
import java.util.*;

class Student1 implements Comparable<Student1> {
    int roll;
    String name;
    int age;

    Student1(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student1 s) {
        if (name.compareTo(s.name)>0) {
            return 1;
        } else if (name.compareTo(s.name)==0) {
            return 0;
        } else {
            return -1;
        }
    }
}

public class comp_str {
    public static void main(String argv[]) {
        ArrayList<Student1> arrl = new ArrayList<>();
        arrl.add(new Student1(10,"Sapna", 23));
        arrl.add(new Student1(5, "Deepak", 45));
        arrl.add(new Student1(59, "Poonam", 45));

        arrl.add(new Student1(54, "Aeepak", 45));

        arrl.add(new Student1(56, "Spak", 45));

        arrl.add(new Student1(50, "Chhoti", 45));


        Collections.sort(arrl);

       for (Student1 s : arrl) {  // Fix: use ":" instead of "."
            System.out.println(s.roll + " " + s.name + " " + s.age);
        }
    }
}
