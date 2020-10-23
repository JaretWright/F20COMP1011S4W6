package DataStructures;

import java.util.HashMap;
import java.util.TreeSet;

public class Maps {
    public static void main(String[] args) {
        //Maps - have a key and a value
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Jaret","705-555-1234");
        contacts.put("Lindsay","613-555-6457");

        for(String key : contacts.keySet())
        {
            System.out.printf("%s's phone number is %s%n",
                    key, contacts.get(key));
        }

        Student student1 = new Student("Fred","Flintstone",1001);
        Student student2 = new Student("Barney","Rubble",1002);
        Student student3 = new Student("Mr.", "Slate", 723);

        student1.addCourse("COMP 1030", 100);
        student1.addCourse("COMP 1008", 98);
        student1.addCourse("COMP 1011", 100);

        student2.addCourse("COMP 1030", 43);
        student2.addCourse("COMP 1030", 63);

        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);

        for (Student student : treeSet)
            System.out.println("Student: "+student +"\n"+student.getTranscript());
    }
}
