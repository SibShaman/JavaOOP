package lesson3;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

    private int index = 0;

    private StudentGroup studentGroup;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroup.studentCount();
    }

    @Override
    public Student next() {
        return studentGroup.nextStudent(index++);
    }
}
