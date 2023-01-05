package lesson2;

public class Student {
  private String FirstName;
  private String SecondName;
  private float AverageGrade;

  public Student(String FirstName, String SecondName, float AverageGrade) {
    this.FirstName = FirstName;
    this.SecondName = SecondName;
    this.AverageGrade = AverageGrade;
  }

  @Override
  public String toString() {
    return "Student{" +
        "getFirstName='" + FirstName + '\'' +
        ", getSecondName='" + SecondName + '\'' +
        ", getAverageGrade=" + AverageGrade +
        '}';
  }
}
