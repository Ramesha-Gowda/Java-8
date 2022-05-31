package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {
    //filer
    public static void optionalFilter(){
     Optional<Student> studentOptional= Optional.ofNullable(StudentDataBase.studentSupplier.get());

     studentOptional
             .filter(student -> student.getGpa()>=3.5)
             .ifPresent(student -> System.out.println(student));
    }
    //map
    public static void optionalMap(){
        Optional<Student> studentOptional= Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()){
        Optional<String> studentName =  studentOptional
                    .filter(student -> student.getGpa()>=3.5)
                    .map(Student::getName);
            System.out.println(studentOptional.get());
        }}

    //flatMap

    public static void optionalFlatMap(){
        Optional<Student> studentOptional= Optional.ofNullable(StudentDataBase.studentSupplier.get());
       Optional<String> name =  studentOptional
                .filter(student -> student.getGpa()>=3.5)//Optional<Student <Optional<Bike>>
                .flatMap(Student::getBike)//<Optional<Bike>//only way to get in Optional inside Optional
                .map(Bike::getName);
       name.ifPresent(s->System.out.println(name.get()));
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
