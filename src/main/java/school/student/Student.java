package school.student;

import school.enums.Grade;
import school.enums.Subject;

import java.util.Map;

public class Student {
    private String name;
    private Map<Subject, Grade> grades;
    boolean isEnrolled;

    public Student(String name, Map<Subject, Grade> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public Map<Subject, Grade> getGrades() {
        return grades;
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", isEnrolled=" + isEnrolled +
                '}';
    }
}
