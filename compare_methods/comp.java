// Implementation of java comaparable interface 
package compare_methods;
import java.util.*;

class Student implements Comparable<Student> {
    int roll;
    String name;
    int age;

    Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student s) {
        if (roll == s.roll) {
            return 0;
        } else if (roll > s.roll) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class comp {
    public static void main(String argv[]) {
        ArrayList<Student> arrl = new ArrayList<>();
        arrl.add(new Student(10,"Sapna", 23));
        arrl.add(new Student(5, "Deepak", 45));
        arrl.add(new Student(59, "Deepak", 45));

        arrl.add(new Student(54, "Deepak", 45));

        arrl.add(new Student(56, "Deepak", 45));

        arrl.add(new Student(50, "Deepak", 45));


        Collections.sort(arrl);

       for (Student s : arrl) {  // Fix: use ":" instead of "."
            System.out.println(s.roll + " " + s.name + " " + s.age);
        }
    }
}
