// using abstract keyword
abstract class Animal{
    abstract void walk();

    }
class Horse extends Animal{
    public void walk(){
        System.out.println("Walks in four legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks in 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
        Chicken chicken=new Chicken();
        chicken.walk();
    }
}
