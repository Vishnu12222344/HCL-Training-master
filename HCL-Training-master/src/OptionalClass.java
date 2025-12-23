/* What is Optional?
Optional<T> is a container object that may or may not contain a non-null value.

Purpose:

-> Avoid NullPointerException
->Make “value may be absent” explicit */


import java.util.Optional;

import static java.lang.Character.getName;

public class OptionalClass {

    public static  void  main(String[] a){
        Optional<String> name = Optional.empty();

        name.ifPresent(n -> System.out.println(n.length()));

    }
}
