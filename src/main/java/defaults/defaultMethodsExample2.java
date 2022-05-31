package defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class defaultMethodsExample2 {
    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    static Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGradeLevel);

    public static void sortByName(List<Student> studentList){
        System.out.println("After Sort");
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer); //use consumer to see in readable format
    }

    public static void sortByGpa(List<Student> studentList){
        System.out.println("After Sort");
        studentList.sort(gpaComparator);
        studentList.forEach(studentConsumer); //use consumer to see in readable format
    }

    public static void comparatorChaining(List<Student> studentList){
        System.out.println("After Comparator Chaining");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer); //use consumer to see in readable format
    }

    public static void sortWithNullValues(List<Student> studentList){
        System.out.println("After Sort with Null value");
        Comparator<Student> studentComparator=  Comparator.nullsFirst(nameComparator);
//        Comparator<Student> studentComparator=  Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
    }

    public static void main(String[] args) {
      List<Student> studentList= StudentDataBase.getAllStudents();
//        System.out.println(studentList);//not readable format
        System.out.println("Before Sort");
        studentList.forEach(studentConsumer); //use consumer to see in readable format


//        sortByName(studentList);//sorted by name
//        sortByGpa(studentList);//sorted by gpa
//        comparatorChaining(studentList);

        sortWithNullValues(studentList);
    }
}
