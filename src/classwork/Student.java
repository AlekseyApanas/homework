package classwork;

import java.io.Serializable;

public class Student implements Serializable {

    private final String firstName;

    private final String lastName;

    private final String middleName;

    private final int mark;

    public Student(String firstName, String lastName, String middleName, int mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFIO() {
        return getLastName() + " " + getFirstName() + " " + getMiddleName();
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Students{" +
                getFIO() +
                ", mark=" + mark +
                '}';
    }
}