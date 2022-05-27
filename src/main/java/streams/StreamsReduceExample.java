package streams;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {
    //reduce() -->terminal operation .used to reduce the contents of a stream to a single value
    static List<Integer> integers = Arrays.asList(1,3,5,7,8);

    public static int performMultiplication(List<Integer> integerList){

        return integerList.stream().reduce(1,(a,b)-> a*b);
    }


    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){

        return integerList.stream().reduce((a,b)-> a*b);
    }
    public static Optional<Student> getHighestGpaStudent(){
       return StudentDataBase.getAllStudents().stream()
//                .reduce((s1,s2)->{
//                    if(s1.getGpa() > s2.getGpa()){
//                        return s1;
//                    }else{
//                        return s2;
//                    }
//                });
               .reduce((s1,s2)->(s1.getGpa()>s2.getGpa())?s1:s2);
    }

    public static void main(String[] args) {
        System.out.println("Result is "+performMultiplication(integers));

        Optional<Integer> result  =  performMultiplicationWithoutIdentity(integers);

        System.out.println("Optional result is "+performMultiplicationWithoutIdentity(integers));
        System.out.println(result.isPresent());
        System.out.println(result.get());


        Optional<Integer> result1  =  performMultiplicationWithoutIdentity(new ArrayList<>());
        System.out.println(result1);
        System.out.println(result1.isPresent());
//        System.out.println(result1.get()); // will get exception if we don't have a value


        Optional<Student> studentOptional = getHighestGpaStudent();
        if(studentOptional.isPresent()){
            System.out.println("Highest GPA Student are "+studentOptional.get());
        }

    }

}
