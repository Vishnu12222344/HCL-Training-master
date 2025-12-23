import java.util.*;

class Unistudent implements Comparable<Unistudent> {

    int marks;
    String name;

    Unistudent(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Unistudent o) {

//        if (this.marks > o.marks) // desc order
//            return -1;
//        else if (this.marks < o.marks)
//            return 1;
//        else
//            return 0;   // VERY important

        //return Integer.compare(o.marks,this.marks); //desecending order
        return Integer.compare(this.marks,o.marks); //ascending order
    }
}

public class TestComparable {

    public static void main(String[] args) {

        List<Unistudent> list = new ArrayList<>();

        list.add(new Unistudent(85, "Ravi"));
        list.add(new Unistudent(92, "Anil"));
        list.add(new Unistudent(78, "Kiran"));
        list.add(new Unistudent(85, "Suresh"));

        // Sorting using Comparable
        Collections.sort(list);

        // Print after sorting
        for (Unistudent s : list) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}
