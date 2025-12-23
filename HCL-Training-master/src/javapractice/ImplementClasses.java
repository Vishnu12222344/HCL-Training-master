package javapractice;

class Calculator {

    public int add(int a, int b) {
        return a+b;

    }
}

public class ImplementClasses {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int res=calc.add(1, 3);
        System.out.println(res);
    }
}
