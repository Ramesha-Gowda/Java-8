package parallelstream;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {
    public static List<String> sequentialPrintStudentActivities(){
        long startTime = System.currentTimeMillis();

        List<String> studentActivities= StudentDataBase.getAllStudents().stream()//stream of students
                .map(Student::getActivities) //Stream<List<String>> -stream of list of string
                .flatMap(List::stream) //Stream<String> -stream of string
                .distinct() //remove duplicates and returns unique values
                .sorted() //sort the elements in ascending order
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the sequential Pipeline "+(endTime-startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities(){
        long startTime = System.currentTimeMillis();

        List<String> studentActivities= StudentDataBase.getAllStudents().stream()//stream of students
                .map(Student::getActivities) //Stream<List<String>> -stream of list of string
                .flatMap(List::stream) //Stream<String> -stream of string
                .parallel()
                .distinct() //remove duplicates and returns unique values
                .sorted() //sort the elements in ascending order
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the Parallel Pipeline "+(endTime-startTime));

        return studentActivities;
    }
    public static void main(String[] args) {
        System.out.println(sequentialPrintStudentActivities());
        System.out.println(parallelPrintStudentActivities());

    }
}
