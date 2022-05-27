package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
    static List<Integer> integerList = Arrays.asList(6,7,9,8,10);
    static List<Integer> emptyIntegerList = Arrays.asList();
    public static Optional<Integer> findMaxValue(List<Integer> integerList){
      return integerList.stream()
//                .reduce(0,(x,y)->x>y?x:y); //avoid assigning a default value when your using min or max method
              .reduce((x,y)->x>y?x:y);
    }

    public static Optional<Integer> findMinValue(List<Integer> integerList){
        return integerList.stream()
//                .reduce(0,(x,y)->x<y?x:y);
                .reduce((x,y)->x<y?x:y);
    }

    public static void main(String[] args) {

        System.out.println("Max Value of List is "+findMaxValue(integerList).get());
        if(findMaxValue(emptyIntegerList).isPresent()){
            System.out.println("Max Value Optional of List is "+findMaxValue(emptyIntegerList).get());
        }else{
            System.out.println("No Value present in list");
        }
        System.out.println("-----------------------------------------");
        System.out.println("Min Value of List is "+findMinValue(integerList).get());
        if(findMinValue(emptyIntegerList).isPresent()){
            System.out.println("Min Value Optional of List is "+findMinValue(emptyIntegerList).get());
        }else{
            System.out.println("No Value present in list");
        }

    }
}
