package parallelstream;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000)
                //1,2,3 ......1000
//                .parallel()//if we have mutalble variable the don't use parallel stram
                .forEach(sum::performSum);
        System.out.println(sum.getTotal());
    }
}
