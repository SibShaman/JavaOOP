package lesson3;

// Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора.
// (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.

//    Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях.
//    Он реализует интерфейс ListIterator<Student>.
//    Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

//    Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
//    • Он отслеживает текущую позицию в переборе
//    • Он изначально выставлен на конечную позицию
//    • Он движется справа налево
//    Проверьте, как он работает.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Main {
  public static void main(String[] args) {
    Student st1 = new Student("Denis", LocalDate.now(), 4.5f);
    Student st2 = new Student("Masha", LocalDate.now(), 4.1f);
    Student st3 = new Student("Anna", LocalDate.now(), 3.6f);
    Student st4 = new Student("Petr", LocalDate.now(), 4.9f);

    List<Student> list = new ArrayList<>();
    list.add(st1);
    list.add(st2);
    list.add(st3);
    list.add(st4);


    StudentGroup studentGroup = new StudentGroup(list);
        for (Student student : studentGroup ) {
            System.out.println(student);
        }

//    Iterator<Student> iter = list.iterator();
//    while (iter.hasNext()) {
//      System.out.println(iter.next());
//    }

    ListIterator<Student> test = studentGroup.listIterator();
    while (test.hasNext()){
      System.out.println(test.next());
    }
    while (test.hasPrevious()){
      System.out.println(test.previous());
    }

  }

}
