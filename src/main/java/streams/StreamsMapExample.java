package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {
    //
    public static List<String> namesList(){
       List<String> studentList =  StudentDataBase.getAllStudents().stream()//stream of students
                //Student as an input -> output is student name
                .map(Student::getName)//converting stream object to string
               .map(String::toUpperCase)//Stream<String> ->uppercase on each string
               .collect(toList());//list of string

        return studentList;
    }
    public static Set<String> namesSet(){
        Set<String> studentSet =  StudentDataBase.getAllStudents().stream()//stream of students
                //Student as an input -> output is student name
                .map(Student::getName)//converting stream object to string
                .map(String::toUpperCase)//Stream<String> ->uppercase on each string
                .collect(toSet());//list of string
        return studentSet;
    }
    public static void main(String[] args) {
        System.out.println(namesList()); //type of list
        System.out.println(namesSet());//type of set
    }
}
