package javapractice;

class Student1{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
/*
    public void setName(String name,Student1 student) {
        Student1 obj1=student;
        student.name = name;
    } */
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String[] a){
        Student1 student=new Student1();

        /* this will not work because we cannot use private variables outside of that class. But we can use inside same class.
         so to make it work we need to call methods not variables.
        student.name="Vishnu";
        student.age=20;
         */

        //student.setName("Vishnu,student); so java says why again you need pass object. so java says to use this keyword instead. this refers to current obj.
        student.setAge(20);
        student.setName("Vishnu");
        System.out.println(student.getName()+" : "+student.getAge());


    }
}