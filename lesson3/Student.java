package lesson3;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate birthday;
    private float avgGrade;

    public Student(String name, LocalDate birthday, float avgGrade) {
        this.name = name;
        this.birthday = birthday;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
