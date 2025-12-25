package javapractice;

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;
        int[] arr = new int[5];

        try {
            // Uncomment to test array exception
            // System.out.println(arr[5]);

            j = 18 / i;   // valid division

            if (j == 0)
                throw new MyException("Result became zero");

            System.out.println("No error occurred");

        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero"+e);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Be in your limits");
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello World");
    }
}
