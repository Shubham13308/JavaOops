interface Animal1{
    int eyes=2;
    void walk();
}
interface Herbivorse{
}
class Horse1 implements Animal1,Herbivorse{

    @Override
    public void walk() {
        System.out.println("Walks in 4 legs");

    }
}
public class Multiple_Inheritance {
    public static void main(String[] args) {
        Horse1 horse1=new Horse1();
        horse1.walk();

    }
}
