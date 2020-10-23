package DataStructures;

public class Student {
    private String firstName, lastName;
    private int studentNum;

    public Student(String firstName, String lastName, int studentNum) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNum(studentNum);
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
}
