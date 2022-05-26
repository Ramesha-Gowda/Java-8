package funtionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    //where i/p and o/p with same type we can use uniary operator
    static UnaryOperator<String> unaryOperator = (s)->s.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));

    }
}
