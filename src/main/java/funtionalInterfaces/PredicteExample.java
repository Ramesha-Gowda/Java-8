package funtionalInterfaces;

import java.util.function.Predicate;

public class PredicteExample {
    static Predicate<Integer> p = (i)->{return i%2==0;};
    static Predicate<Integer> p1 = i-> i%2==0;
    static Predicate<Integer> p2 = i-> i%5==0;

    public static void predicateAnd(){
        System.out.println("Predicate And Result is " + p1.and(p2).test(10));//Predicate Chaining
        System.out.println("Predicate And Result is " + p1.and(p2).test(9));//Predicate Chaining
    }
    public static void predicateOr(){
        System.out.println("Predicate Or Result is " + p1.or(p2).test(10));//Predicate Chaining
        System.out.println("Predicate Or Result is " + p1.or(p2).test(9));//Predicate Chaining
    }
    //Reverse the result
    public static void predicateNegate(){
        System.out.println("Predicate Or Negate Result is " + p1.or(p2).negate().test(10));//Predicate Chaining
        System.out.println("Predicate Or Negate Result is " + p1.or(p2).negate().test(9));//Predicate Chaining
    }

    public static void main(String[] args) {
        System.out.println(p.test(4));
        System.out.println(p1.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
