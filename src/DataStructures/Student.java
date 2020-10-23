package DataStructures;

public class Student implements Comparable<Student>{
    private String firstName, lastName;
    private int studentNum;
    private int grade;

    public Student(String firstName, String lastName, int studentNum) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNum(studentNum);
        grade = 70;
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
        return String.format("%d %s %s", studentNum, firstName, lastName);
    }


    @Override
    public int compareTo(Student otherStudent) {
        return this.studentNum-otherStudent.studentNum;
    }
}
