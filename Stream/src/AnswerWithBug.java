import java.util.*;
import java.util.stream.*;

public class AnswerWithBug {
  public static void main(String[] args) {
    List<Student> studentsWithoutAge = Arrays.asList(
      new Student("1", "Vishwa", null),
      new Student("3", "Ravi", null),
      new Student("2", "Ram", null)
    );

    Map<String,String> map = new HashMap() {{
      put("1","20");
      put("2","30");
    }};

    
  	  System.out.println( studentsWithoutAge.stream()
                .filter(s->s.getId()
                .equals(map.entrySet()
                .stream() 
                .map(Map.Entry::getKey)))
                .count());
   
  }

 
  }
