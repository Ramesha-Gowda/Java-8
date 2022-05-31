package defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class defaultMethodExample {
    public static void main(String[] args) {
        /**
         * Sort list of names in alphabetical order
         */
        List<String> stringList = Arrays.asList("Adam","Jenny","Alex","Dan","Mike","Eric");
        /**
         * Prior Java 8
         */
//        Collections.sort(stringList);
//        System.out.println("Sorted list using Collections.Sort() : "+stringList);


        /**
         * Java 8
         */
        stringList.sort(Comparator.naturalOrder());//sort in natural order

        System.out.println("Sorted list using List.Sort() : "+stringList);
        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted list using List.Sort() reverse : "+stringList);
    }
}
