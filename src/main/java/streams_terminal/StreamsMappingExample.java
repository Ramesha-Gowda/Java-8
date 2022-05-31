package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {
    public static void main(String[] args) {
       List<String> namesList =  StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList()));
        System.out.println("nameList : "+namesList);

        Set<String> namesSet =  StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet()));
        System.out.println("nameSet : "+namesSet);

    }

}
