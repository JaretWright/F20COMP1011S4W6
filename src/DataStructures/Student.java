package DataStructures;

import java.util.HashMap;
import java.util.TreeMap;

public class Student implements Comparable<Student>{
    private String firstName, lastName;
    private int studentNum;
    private int grade;
    TreeMap<String, Integer> courses;

    public Student(String firstName, String lastName, int studentNum) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNum(studentNum);
        grade = 70;
        courses = new TreeMap<>();
    }

    /**
     * This method will return the average grade
     */
    public Double getAverageGrade()
    {
        double sum = 0;

        for (String key : courses.keySet())
            sum += courses.get(key);

        return sum / courses.size();
    }


    /**
     * This method will add a course code and a grade for each
     * student
     */
    public void addCourse(String courseCode, int gradeAchieved)
    {
        //course codes look like XXXX 1234
        if (!courseCode.matches("[A-Z]{4}\\s[0-9]{4}"))
            throw new IllegalArgumentException("Invalid course code, must be XXXX 1234");

        if (gradeAchieved>=0 && gradeAchieved <= 100)
            courses.put(courseCode, gradeAchieved);
        else
            throw new IllegalArgumentException("grade must be in the range of 0-100");


    }


    public void increaseGrade()
    {
        grade += 5;
        if (grade > 100) grade = 100;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        if (studentNum>0)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("student number must be greater than 0");
    }

    public String toString()
    {
        return String.format("%d %s %s (%.1f%%)", studentNum, firstName, lastName, getAverageGrade());
    }


    @Override
    public int compareTo(Student otherStudent) {
        return this.studentNum-otherStudent.studentNum;
    }

    /**
     * This returns a String showing all the courses and most recent grade achieved
     * @return
     */
    public String getTranscript()
    {
        StringBuilder sb = new StringBuilder();

        for (String course: courses.keySet())
            sb.append(String.format("%9s -> %3d%%%n",course, courses.get(course)));

        return sb.toString();
    }
}
