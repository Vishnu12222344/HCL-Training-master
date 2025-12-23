import java.util.*;

public class StreamsAPI {
    public static void main(String[] args) {

//      List<Integer> l1 = javapractice.Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        List<String> l2 = l1.stream()
                .map(i -> i % 2 == 0 ? "Even" : "Odd")
                .toList();

        List<Integer> evenList = l1.stream()
                .filter(i -> i % 2 == 0)
                .toList();

        List<Integer> oddList = l1.stream()
                .filter(i -> i % 2 != 0)
                .toList();


        System.out.println(evenList);
        System.out.println(oddList);
    }
}
