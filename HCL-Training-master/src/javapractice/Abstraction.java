package javapractice;
abstract class Car{   // if we are having abstract methods in a class then we also must have abstract class
    abstract public void drive();
    abstract public void fly();

    public void playMusic(){
        System.out.println("Music Playing");
    }
}
abstract class Wagon extends Car{   // we must implement all abstract methods. to overcome that we must declare it as abstract.

    public void drive(){
        System.out.println("Driving..");
    }
}
class Tayota extends Wagon{   // we must implement all abstract methods. to overcome that we must declare it as abstract.

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
public class Abstraction {
    public static void main(String[] a){
        // Car car=new Car(); we cannot create object for abstract class, but we can create reference.
        Car car=new Tayota();  // then again we cannot create object for abstract class.
        car.drive();
        car.playMusic();
        car.fly();

    }
}
