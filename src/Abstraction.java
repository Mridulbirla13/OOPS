abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
//Abstraction acn be implemented using 2 methods:
//Abstract class
//Interfaces(Pure Abstraction)
//Pure abstraction hides all the useless information and shows only relevant info
class Chicken extends Animal{
    @Override
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}
//abstract class can be made by abstract keyword
//abstract class can have abstract and non-abstract method
//It cannot be instantiated
//It can have constructors and static methods also.
//It can have final methods which will force the subclass
// not to change the body of the method
public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
