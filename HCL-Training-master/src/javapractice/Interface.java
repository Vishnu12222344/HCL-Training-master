package javapractice;
/*
class --> class --> extends
class --> interface --> implements
interface --> interface --> extends
*/

interface Animal{
//    String species;   In interface variable do not have memory so by default interface variable are final and static.
    String species="cat";
    // public abstract void eat();  In interfaces by default method are public abstract. So we don't need to declare again.
    void sleep();
    void eat();
}
interface WildAnimals extends Animal{
    void killers();

}
class Dog implements WildAnimals,Animal{     // we must implement all abstract methods in interface.

    public void killers() {
        System.out.println("Kills people");
    }
    public void sleep() {
        System.out.println("Sleeping");
    }

    public void eat() {
        System.out.println("Eating");
    }
}


public class Interface {
    public static void main(String[] args) {
        //Animal A=new Animal();           we cannot create objects for interfaces, but we can create reference.
        /*
        this will work completely fine. But what we need to do to call all Three methods by creating one reference.see line 48.
//      Animal animal = new Dog();   // with Animal reference we can call only its methods, see line 41.
        animal.sleep();
        animal.eat();

        WildAnimals wild=new Dog();  // If we need to call methods of WildAnimals we need to create reference of wildAnimals.
        wild.killers();
        wild.eat();
        wild.sleep();
         */
//        WildAnimals wild = new Dog(); // without casting
//        wild.killers();
//        wild.sleep();
//        wild.eat();

        Animal animal=new Dog();
        animal.eat();
        animal.sleep();
        ((WildAnimals) animal).killers();  // when we need to call with Animal reference we need to use casting(Interface or cross casting)
        System.out.println(animal.species); // we call interface variables directly because they are by default static.

    }
}


//You can declare variables at class level
//You cannot execute statements (method calls) at class level