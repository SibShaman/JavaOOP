package lesson2;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter extends WriterInFile {

  @Override
  public void SaveAs(Student student, String path) {

    try (FileWriter fileWriter = new FileWriter(path, true)) {
      String firstName = student.getFirstName();
      String secondName = student.getSecondName();
      float average = student.getAverageGrade();

      String fileToGson = String.format("\n\"%s %s\" : %.1f\n", firstName, secondName, average);
      fileWriter.write(fileToGson);

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
