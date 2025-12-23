import java.lang.classfile.constantpool.IntegerEntry;
import java.util.*;
import java.util.function.Function;

// Functional Interface implementation
class StringLengthFunction implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer s) {
        //return s.length();
        //return s.toUpperCase();
        return (int)Math.pow(s,2);
    }
}

public class TestFunctionalInterface {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
      ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        Function<Integer, Integer> f = new StringLengthFunction();

        for (Integer s : l1) {
            l2.add(f.apply(s));
        }



        System.out.println(l2);

    }
}
