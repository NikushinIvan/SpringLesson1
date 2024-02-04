package school.enums;

public enum Grade {

    A(5),
    B(4),
    C(3),
    D(2);

    private final int grade;

    Grade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

}
