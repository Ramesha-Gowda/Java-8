package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
    //Sort Student By name
    public static List<Student> sortedStudentsByName(){
       return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))//it accepts comparator or ntg
                .collect(Collectors.toList());

    }

    //Sort Student By gpa
    public static List<Student> sortedStudentsByGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))//it accepts comparator or ntg
                .collect(Collectors.toList());

    }

    public static List<Student> sortedStudentsByGpaByDesc(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())//it accepts comparator or ntg
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println("Student Sorted By name");
        sortedStudentsByName().forEach(System.out::println);
        System.out.println("---------------------------------------------");
        System.out.println("Student Sorted By Gpa");
        sortedStudentsByGpa().forEach(System.out::println);
        System.out.println("---------------------------------------------");
        System.out.println("Student Sorted By Gpa Desc");
        sortedStudentsByGpaByDesc().forEach(System.out::println);
    }
}
