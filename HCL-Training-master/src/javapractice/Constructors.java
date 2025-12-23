package javapractice;

class Person{
    String name;
    int age;

    public Person(){
        name="subbareddy";
        age=19;
        System.out.println("Inside Constructor");      // default constructor
    }

    public Person(String name, int age) {
        this.name = name;                             // parameterized constructors
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }
}

public class Constructors {
    public static void main(String [] a){
        Person p1=new Person();
        Person p2=new Person("Vishnu",20);
        Person p3=new Person("Mahesh");

        System.out.println(p1.name+" "+p1.age);
        System.out.println(p2.name+" "+p2.age);
        System.out.println(p3.name);
    }
}
