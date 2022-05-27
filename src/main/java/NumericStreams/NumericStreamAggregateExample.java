package NumericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {


    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is : "+sum);
        System.out.println("----------------------");

        OptionalInt max = IntStream.rangeClosed(1,50).max();
        System.out.println(max.isPresent()?max.getAsInt():0);
        if(max.isPresent()) {
            System.out.println("Max value is :" + max);
        }
        System.out.println(IntStream.rangeClosed(1,50).count());

        OptionalLong optionalLong = LongStream.rangeClosed(50,100).min();
        System.out.println("Min Value is : "+(optionalLong.isPresent()?optionalLong.getAsLong():0));

        OptionalDouble optionalDouble =IntStream.rangeClosed(1,50).average();
        System.out.println("average Value is : "+(optionalDouble.isPresent()?optionalDouble.getAsDouble():0));
    }
}
