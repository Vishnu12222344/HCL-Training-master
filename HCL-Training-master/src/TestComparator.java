import java.util.*;

class Unistudent1 {

    int rollNo;
    int marks;
    double cgpa;
    String name;

    Unistudent1(int rollNo, int marks, double cgpa, String name) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.cgpa = cgpa;
        this.name = name;
    }
}

public class TestComparator {

    public static void main(String[] args) {

        List<Unistudent1> list = new ArrayList<>();

        list.add(new Unistudent1(103, 85, 8.2, "Ravi"));
        list.add(new Unistudent1(101, 92, 9.1, "Anil"));
        list.add(new Unistudent1(105, 85, 9.1, "Suresh"));
        list.add(new Unistudent1(102, 78, 7.9, "Kiran"));

        /* ================= USE CASES ================= */

        // 1️⃣ Sort by Roll No (ascending)
        Comparator<Unistudent1> byRollNo =
                (s1, s2) -> Integer.compare(s1.rollNo, s2.rollNo);

        // 2️⃣ Sort by CGPA (descending)
        Comparator<Unistudent1> byCgpaDesc =
                (s1, s2) -> Double.compare(s2.cgpa, s1.cgpa);

        // 3️⃣ Sort by Marks (asc) → CGPA (desc)
        Comparator<Unistudent1> byMarksThenCgpa =
                (s1, s2) -> {
                    int marksCompare = Integer.compare(s1.marks, s2.marks);
                    if (marksCompare != 0)
                        return marksCompare;
                    return Double.compare(s2.cgpa, s1.cgpa);
                };

        // 4️⃣ Sort by CGPA (desc) → Roll No (asc)
        Comparator<Unistudent1> byCgpaThenRoll =
                (s1, s2) -> {
                    int cgpaCompare = Double.compare(s2.cgpa, s1.cgpa);
                    if (cgpaCompare != 0)
                        return cgpaCompare;
                    return Integer.compare(s1.rollNo, s2.rollNo);
                };

        /* ====== CHOOSE ONE USE CASE ====== */

        Collections.sort(list, byMarksThenCgpa); // change comparator here

        /* ============== OUTPUT ============== */

        for (Unistudent1 s : list) {
            System.out.println(
                    s.rollNo + " | " + s.name + " | " + s.marks + " | " + s.cgpa
            );
        }
    }
}
