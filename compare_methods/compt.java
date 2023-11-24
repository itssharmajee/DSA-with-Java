package compare_methods;
// Implementation of java comparator class 
import java.io.*;
import java.lang.*;
import java.util.*;

class Stu{
    String name;
    int age;
    int roll;
    public Stu(int roll, String name, int age){
        this.roll=roll;
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return (this.roll+" "+this.name+" "+this.age);
    }
}
class SortedAge implements Comparator<Stu>{
    public int compare(Stu s,Stu s1){
        return s.age - s1.age;
    }
}
class SortedName implements Comparator<Stu>{
    public int compare(Stu s,Stu s1){
        return s.name.compareTo(s1.name);
    }
}


public class compt {
    public static void main(String[] args) {
        ArrayList<Stu> arrl=new ArrayList<>();
        arrl.add(new Stu(12,"Bsapna",34));
        arrl.add(new Stu(11, "Deepak", 12));
        arrl.add(new Stu(54,"Samin",50));
        System.out.println("Before Sorting");
        for(int i=0; i<arrl.size();i++){
            System.out.println(arrl.get(i));
        }
        System.out.print("\nAfter Sorting");
        Collections.sort(arrl,new SortedAge());
        System.out.println("\n Age");
        for(int i=0; i<arrl.size();i++){
            System.out.println(arrl.get(i));
        }
        System.out.println("\nAfter sorting Name");
        Collections.sort(arrl,new SortedName());
        for(int i=0; i<arrl.size();i++){
            System.out.println(arrl.get(i));
        }



    }
}
