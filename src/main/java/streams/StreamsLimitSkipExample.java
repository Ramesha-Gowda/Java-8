package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integerList){
       return integerList.stream()
                .limit(2)//it takes first 2 stream
                .reduce((x,y)->x+y);//it sum both stream value and produce a result
    }

    public static Optional<Integer> skip(List<Integer> integerList){
        return integerList.stream()
                .skip(3)//it skips first 3 stream
                .reduce((x,y)->x+y);//it sum  stream value and produce a result
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,10);
        Optional<Integer> limitResult = limit(integers);
            if(limitResult.isPresent()){
                System.out.println("The Limit Result is "+limitResult.get());
            }else{
                System.out.println("No input  is passed");
            }
        Optional<Integer> skipResult = skip(integers);
        if(skipResult.isPresent()){
            System.out.println("The Skip Result is "+skipResult.get());
        }else{
            System.out.println("No input  is passed");
        }
    }
}
