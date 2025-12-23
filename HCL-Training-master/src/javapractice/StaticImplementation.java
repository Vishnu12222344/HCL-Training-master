package javapractice;

class Student {
    String name;
    int marks;
    static String college;   // every time we change value of college then all objects will be effected.

    static {
        college = "";   // static initialization
    }

    public Student() {
        System.out.println("Inside constructor");

    }

    public void show() {
        System.out.println(name + " " + marks + " " + college);
    }

    public static void show1(Student obj) {
        System.out.println(obj.name + " " + obj.marks + " " + college);
    }
}

public class StaticImplementation {

    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.name="Vishnu";
        obj1.marks=20;
        Student.college="IIT";

        Student obj2 = new Student();
        obj2.name="Mahesh";
        obj2.marks=25;
        Student.college="Viswasai";


        obj1.show();
        obj2.show();

        Student.show1(obj1);
    }
}

//Non-static methods CAN access static variables directly
//Static methods CANNOT access non-static variables directly
