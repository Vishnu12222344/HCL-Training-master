package javapractice;

enum Laptop{
    Macbook(2000),Thinkpad(3000),Dell,Victus(5000);
    private int price;
    private Laptop(){
        price=4000;
    }

    private Laptop(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enumimplementation {
    public static void main(String[] args){
        // Laptop lap=new Laptop();  In Java, every enum constant is already a public static final object (instance) of the enum class itself, so you don't use the new keyword to create new, separate objects at runtime.
//        Laptop lap= Laptop.Dell;
//        System.out.println(lap.getPrice());

            // if we need to call Constants at once then use enhanced for loop.
        for(Laptop lap: Laptop.values()){
            System.out.println(lap+" : "+ lap.getPrice());
        }
    }
}

/*
 --> Enum constructors are implicitly private.

Even if you write:

public Laptop(int price) { }
the compiler will give an error.

Why?
Because:

Enum objects are created only once by the JVM.

You are not allowed to create new enum objects using new.

If constructors were public, someone could try:

new Laptop(6000); // ❌ not allowed
So Java forces constructors to be private to protect the enum constants.
 */