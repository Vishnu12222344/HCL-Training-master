package javapractice;

class A{

    public A(){
        super();
        System.out.println("In A");        // B extends A but what A extends?? In java A extends Object class.
    }
    public A(int a){
        super();
        System.out.println("In A with int");
    }

}
class B extends A{
    public B(){
        super();
        System.out.println("In B");  // when we create object for B then it will call constructor of A & B because
                                     // of super, we didn't mention super, but it worked because super will be called if we didn't mention but if we want to pass any parameters in super we need to mention super.
    }
    public B(int b){
        this();  // this() will call this class constructor.
        // super();
        System.out.println("In B with int");
    }
}

public class ThisVSSuper {
    public static void main(String[] a){
        B obj = new B(5);
    }
}
