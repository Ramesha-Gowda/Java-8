package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamPartitioningByExample {

    public static void partitioiningBy_1() {
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> partitioningMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate));
        System.out.println("partitioiningBy_1"+partitioningMap);
    }


    public static void partitioiningBy_2() {
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> partitioningMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(
                        partitioningBy(gpaPredicate,toSet()));
        System.out.println("partitioiningBy_2"+partitioningMap);
    }
    public static void main(String[] args) {
        partitioiningBy_1();
        System.out.println("------------------------------");
        partitioiningBy_2();
    }
}
