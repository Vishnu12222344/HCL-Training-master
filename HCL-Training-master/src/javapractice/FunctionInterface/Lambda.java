package javapractice.FunctionInterface;

@FunctionalInterface
interface A{
    int show(int i, int j);
    //public void config();  Functional interfaces are the interfaces which has only one method.
}
//class B implements A{
//    public void show(int a, int b){
//    }
//}

public class Lambda {
    public static void main(String[] args){
        //A a=new B();          // we cannot create object for interface so i created object for B.

        // But we can use like this.
//        A a=new A(){
//          public void show(){
//              System.out.println("in A show")  ;
//          }
//        };
        // using lambda expressions we can reduce this code lets see how??
        // A a= () ->System.out.println("In A show");

        // if we need to use lambda with parameters. then
        // A a= (i)-> System.out.println("In A show");

        // using lamda with return type.

        // A a= (i, j) -> i + j; or
        A a= Integer::sum;

        int res= a.show(5,6);
        System.out.println(res);

    }
}

// we can use lambda expressions only in functional interface.