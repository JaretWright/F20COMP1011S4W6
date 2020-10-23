package DataStructures;

import java.util.*;

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

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println("After sorting: "+arrayList);

        //This will show how to sort based on the grades
        //1. add some grades to the students
        //2. create a custom sort algorithm
        student1.addCourse("COMP 1030", 100);
        student1.addCourse("COMP 1008", 98);
        student1.addCourse("COMP 1011", 100);

        student2.addCourse("COMP 1030", 43);
        student2.addCourse("COMP 1030", 63);

        student3.addCourse("COMP 1030", 76);
        student3.addCourse("COMP 1011", 71);

        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getAverageGrade().compareTo(s2.getAverageGrade());
            }
        });
        System.out.println("sorted by avg grade (low to high): "+arrayList);

        //Writing as a lamdba expression sorting high to low
        Collections.sort(arrayList,(s1, s2)->{
            return s2.getAverageGrade().compareTo(student1.getAverageGrade());
        });
        System.out.println("sorted by avg grade (high to low): "+arrayList);

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
