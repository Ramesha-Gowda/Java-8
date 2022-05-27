package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapDistinctCountSortedExample {

    public static List<String> printStudentActivities(){
       List<String> studentActivities= StudentDataBase.getAllStudents().stream()//stream of students
                .map(Student::getActivities) //Stream<List<String>> -stream of list of string
               .flatMap(List::stream) //Stream<String> -stream of string
               .distinct() //remove duplicates and returns unique values
               .sorted() //sort the elements in ascending order
               .collect(toList());
       return studentActivities;
    }

    public static long getStudentActivitiesCount(){
        long numberStudentActivities= StudentDataBase.getAllStudents().stream()//stream of students
                .map(Student::getActivities) //Stream<List<String>> -stream of list of string
                .flatMap(List::stream) //Stream<String> -stream of string
                .distinct()//remove duplicates and returns unique values
                .count(); //return long with number of elements preset in stream
        return numberStudentActivities;
    }


    public static void main(String[] args) {
        System.out.println("printStudentActivities "+printStudentActivities());
        System.out.println("Total Number of Activities "+getStudentActivitiesCount());
    }
}
