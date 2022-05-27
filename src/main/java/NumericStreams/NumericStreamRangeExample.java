package NumericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {
    public static void main(String[] args) {
       IntStream intStream= IntStream.range(1,50);
        System.out.println("Range Count "+intStream.count());
        //1to 49
        IntStream.range(1,50).forEach((value -> System.out.print(value+" ")));

        IntStream intStream1= IntStream.rangeClosed(1,50);
        System.out.println("Range Closed Count "+intStream1.count());
        IntStream.rangeClosed(1,50).forEach((value -> System.out.print(value+" ")));

        LongStream longStream= LongStream.range(1,50);
        System.out.println("Long Stream Range Closed Count "+longStream.count());
        LongStream.rangeClosed(1,50).forEach((value -> System.out.print(value+" ")));

        IntStream.range(1,50).asDoubleStream().forEach((value -> System.out.println(value + "")));
    }
}
