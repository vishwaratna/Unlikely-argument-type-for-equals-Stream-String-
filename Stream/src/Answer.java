import java.util.*;
import java.util.stream.*;

public class Answer {
  public static void main(String[] args) {
    List<Student> studentsWithoutAge = Arrays.asList(
      new Student("1", "Vishwa", null),
      new Student("3", "Ravi", null),
      new Student("2", "Ram", null)
    );

    Map<String,String> ageById = new HashMap() {{
      put("1","20");
      put("2","30");
    }};

    List<Student> studentsWithAge = addAge(studentsWithoutAge, ageById);

    System.out.println("Students without age: " + studentsWithoutAge);
    System.out.println("Students with age: " + studentsWithAge);
  }

  static List<Student> addAge(List<Student> students, Map<String,String> ageById) {
    return students.stream()
                   .map(student -> {
                      String age = ageById.getOrDefault(student.getId(), null);
                      return new Student(student.getId(), student.getName(), age);
                   })
                   .collect(Collectors.toList());
  }
}