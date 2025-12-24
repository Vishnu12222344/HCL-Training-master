package javapractice;

class ABC{

    int age;
    public void show(){
        System.out.println("In class ABC");
    }
    class XYZ{
        public void show() {
            System.out.println("In class XYZ");
        }
    }
    static class PQR{
        public void show() {
            System.out.println("In class PQR");
        }
    }
}

public class Innerclass {
    public static void main(String[] a){
        ABC obj=new ABC();
        obj.show();
        //  for creating object for XYZ class we cant create directly so we need to do like this.

        // without static, we need to use ABC object i.e, obj.

        ABC.XYZ obj1=obj.new XYZ();
        obj1.show();

        // with static, here we don't want any others object to create object for PQR.

        ABC.PQR obj2= new ABC.PQR();
        obj2.show();


    }
}
