package NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static List<Integer> mapToObject(){
       return IntStream.rangeClosed(1,5)
                .mapToObj((i)->{
                    return new Integer(i);
                })
                .collect(Collectors.toList());
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,5)//intStream
                .mapToLong((i)->i)//convert intStream to LongStream
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5)//intStream
                .mapToDouble((i)->i)//convert intStream to doublestream
                .sum();
    }
    public static void main(String[] args) {
        System.out.println("Map To Object : "+mapToObject());
        System.out.println("Map To Long : "+mapToLong());
        System.out.println("Map To Double : "+mapToDouble());

    }
}
