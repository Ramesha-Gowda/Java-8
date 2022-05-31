package optional;

import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {
        //isPresent
        Optional<String > optional = Optional.ofNullable("Hello Optional");

        System.out.println(optional.isPresent());//checks whether it has some value or not
        if (optional.isPresent()){
            System.out.println("isPresent Value : "+optional.get());
        }

        //ifPresent
        optional.ifPresent(s -> System.out.println("ifPresent : "+s));
    }
}
