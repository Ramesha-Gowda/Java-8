package parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier,int numberOfTimes){
        long startTime = System.currentTimeMillis();
        for (int i=0;i<numberOfTimes;i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
    public static int sumSequentialStream(){
       return IntStream.rangeClosed(1,1000)
                .sum();
    }
    public static int sumParallelStream(){
        return IntStream.rangeClosed(1,1000)
                .parallel()//split data into multiple parts
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());//gives you number of processor this machine as

        System.out.println("Sequential Stream Result is "+ checkPerformanceResult(ParallelStreamExample::sumSequentialStream,20));
        System.out.println("Parallel Stream Result is "+ checkPerformanceResult(ParallelStreamExample::sumParallelStream,20));
    }
}
