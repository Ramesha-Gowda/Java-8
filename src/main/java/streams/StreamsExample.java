package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//collect() -->Terminal operator

public class StreamsExample {
    public static void main(String[] args) {
        //student name and their activities in a map
        Predicate<Student> studentPredicate = (student)->student.getGradeLevel()>=3;
        Predicate<Student> studentGpaPredicate = (student)->student.getGpa()>=3.9;

        //Sequential Stream
       Map<String, List<String>> studentMap =
               StudentDataBase.getAllStudents().stream()
                       .peek(student -> { //it accepts consumer
                           System.out.println("After Stream "+student);
                       })
               .filter(studentPredicate) // it accepts predicate,Stream of Students
                       .peek(student -> { //it accepts consumer
                           System.out.println("after 1st filter "+student);
                       })
                       .filter(studentGpaPredicate)//Stream of Students
                       .peek(student -> { //it accepts consumer
                           System.out.println("after 2nd filter "+student);
                       })
                       .collect(Collectors.toMap(Student::getName,Student::getActivities));//Map

        System.out.println(studentMap);

    //Parallel Streams
//        Map<String, List<String>> studentMap1 =
//                StudentDataBase.getAllStudents().parallelStream()
//                        .filter(studentPredicate)
//                        .filter(studentGpaPredicate)
//                        .collect(Collectors.toMap(Student::getName,Student::getActivities));
//
//        System.out.println(studentMap1);
    }
}

