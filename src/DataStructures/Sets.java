package DataStructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Student student1 = new Student("Fred","Flintstone",1001);
        Student student2 = new Student("Barney","Rubble",1002);
        Student student3 = new Student("Mr.", "Slate", 723);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student1);

        for (Student student: arrayList)
            student.increaseGrade();

        //HashSet will not allow duplicates, you cannot predict the order of the
        //elements in the Set
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student1);

        System.out.println("hashset size: "+hashSet.size());
        System.out.println(hashSet);

        //TreeSet - this is a set, so no duplicates, but adds the elements in order
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student1);


    }
}
