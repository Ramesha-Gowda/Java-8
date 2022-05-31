package optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
    public static Optional<String> ofNullable(){
       Optional<String> stringOptional = Optional.ofNullable("Hello");//return value == null ? empty() : of(value);
//        Optional<String> stringOptional = Optional.ofNullable(null);//retuns empty Optional
        return  stringOptional;
    }

    public static Optional<String> of(){
        Optional<String> stringOptional = Optional.of("Hello");
//        Optional<String> stringOptional = Optional.of(null); //return nullpointerexception
        return  stringOptional;
    }

    public static Optional<String> empty(){
       return Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println("ofNullable "+ofNullable().get());
        System.out.println("of "+of().get());
        System.out.println("empty "+empty());
    }
}
