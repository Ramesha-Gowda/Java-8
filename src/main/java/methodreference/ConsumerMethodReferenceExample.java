package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    //Classname::MethodName
    static Consumer<Student> c1 = System.out::println;
    //Classname::InstanceMethodName
    static Consumer<Student> c2 = Student::printActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
