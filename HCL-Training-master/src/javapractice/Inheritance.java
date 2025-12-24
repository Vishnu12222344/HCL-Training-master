package javapractice;

class Calc{

    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }

}
class AdvCalc extends Calc{

    public int add(int a,int b){     // Method overriding is a thing in which methods have same name and same parameters but different behavior.
        return a+b+1;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}

public class Inheritance {
    public static void main(String[] args){
        AdvCalc obj=new AdvCalc();    // if we create object or only Calc() then we cannot move with mul and div.
        int r1= obj.add(3,4);           // so we need to create for AdvCalc().
        int r2= obj.sub(3,4);
        int r3= obj.mul(3,4);
        int r4= obj.div(3,4);
        System.out.println(r1+" "+r2+" "+r3+" "+r4);

    }
}

/* Multiple inheritance is not possible in java because if we are having same methods in parent and child then the obj do
not have idea which method it should call. so to overcome with the problem java removed Multiple inheritance.*/
