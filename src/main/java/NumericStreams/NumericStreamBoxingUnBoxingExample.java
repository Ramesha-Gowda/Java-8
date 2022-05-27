package NumericStreams;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnBoxingExample {
    public static List<Integer> boxing(){
       return IntStream.rangeClosed(1,10)//intstream of 10 elements
                .boxed()//it converts int to Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
        //Wrapper to primitive
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main(String[] args) {
        System.out.println("Boxing  : "+boxing());

        List<Integer> integerList = boxing();
        System.out.println("Un Boxing  : "+unBoxing(integerList));

    }
}

