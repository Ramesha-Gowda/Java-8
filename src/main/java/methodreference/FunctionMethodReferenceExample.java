package methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String ,String> toUpperCaseMethod = (s)->s.toUpperCase();
    static Function<String ,String> toUpperCaseMethodReference = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(toUpperCaseMethod.apply("java 8"));
        System.out.println(toUpperCaseMethodReference.apply("java 8"));
    }
}
