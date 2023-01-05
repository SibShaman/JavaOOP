package lesson2;

public class Student {
  private String getFirstName;
  private String getSecondName;
  private float getAverageGrade;

  public Student(String getFirstName, String getSecondName, float getAverageGrade) {
    this.getFirstName = getFirstName;
    this.getSecondName = getSecondName;
    this.getAverageGrade = getAverageGrade;
  }

  public String getGetFirstName() {
    return getFirstName;
  }

  public String getGetSecondName() {
    return getSecondName;
  }

  public float getGetAverageGrade() {
    return getAverageGrade;
  }

  @Override
  public String toString() {
    return "Student{" +
        "getFirstName='" + getFirstName + '\'' +
        ", getSecondName='" + getSecondName + '\'' +
        ", getAverageGrade=" + getAverageGrade +
        '}';
  }
}
