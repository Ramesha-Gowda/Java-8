package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {
    public static void main(String[] args) {
        //Collection
        ArrayList<String> names = new ArrayList<>();//Collections is allow you to add or modify or delete it
        names.add("adam");
        names.add("jim");
        names.add("jenny");
        names.add("roman");

        names.remove(0);
        System.out.println(names.get(2)); //we can acess in any order
        System.out.println(names);

        for (String name : names) {//it can be traversed n number times
            System.out.println(name);
        }
        for (String name : names) {//it can be traversed n number times
            System.out.println(name);
        }

        //Streams
        Stream<String> nameStream = names.stream();// stream doesn't allow you to add or modify or delete it
        //we can access only in sequential order

        nameStream.forEach(System.out::println);
//        nameStream.forEach(System.out::println);//we can use only once-will get illegalstateexception exception
    }
}
