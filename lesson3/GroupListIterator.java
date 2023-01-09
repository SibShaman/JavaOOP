package lesson3;

import java.util.ListIterator;
import static java.util.Objects.isNull;

public class GroupListIterator implements ListIterator<Student> {

    private ListIterator<Student> myListIterator;

    public GroupListIterator(ListIterator<Student> myListIterator) {
        this.myListIterator = myListIterator;
    }

    @Override
    public boolean hasNext() {
        return myListIterator.hasNext();
    }

    @Override
    public Student next() {
        return myListIterator.next();
    }

    @Override
    public boolean hasPrevious() {
        return myListIterator.hasPrevious();
    }

    @Override
    public Student previous() {return myListIterator.previous(); }

    @Override
    public int nextIndex() {
        return myListIterator.nextIndex();
    }

    @Override
    public int previousIndex() {
        return myListIterator.previousIndex();
    }

    @Override
    public void remove() { myListIterator.remove(); }

    @Override
    public void set(Student student) {
        if (isNull(student)) {
            return;
        }
        myListIterator.set(student);
    }
    @Override
    public void add(Student student) {
        if (isNull(student)) {
            return;
        }
        myListIterator.add(student);
    }
}
