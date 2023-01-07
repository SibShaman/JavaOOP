package lesson3;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int studentCount() {
        return studentList.size();
    }

    public Student nextStudent(int index) {
        return studentList.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return studentList.iterator();
    }
}
