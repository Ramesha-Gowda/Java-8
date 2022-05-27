package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamsFindFirstFindAnyExample {

    public static Optional<Student> findAny(){
       return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }
    public static void main(String[] args) {
        Optional<Student> studentFindAny = findAny();
        if(studentFindAny.isPresent()){
            System.out.println("Found Student is :"+studentFindAny.get());
        }else{
            System.out.println("No Student Found");
        }

        Optional<Student> studentFindFirst = findFirst();
        if(studentFindFirst.isPresent()){
            System.out.println("Found First Student is :"+studentFindFirst.get());
        }else{
            System.out.println("No Student Found");
        }
    }
}
