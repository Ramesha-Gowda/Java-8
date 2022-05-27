package NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static int sumOfNumber(List<Integer> integerList){
       return integerList.stream()
                .reduce(0,(x,y)->x+y);//unboxing to convert the integer to int
    }
    public static int sumOfNumberIntSream(){
       return IntStream.rangeClosed(1,6)//1,2,3,4,5,6
                .sum();
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum of Number : "+sumOfNumber(integerList));

        System.out.println("Sum of Number using IntStream : "+sumOfNumberIntSream());
    }
}
