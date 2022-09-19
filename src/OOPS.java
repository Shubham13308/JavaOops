class Pen{
    String color;
    String type; // ballpoint;gel


public void write(){
    System.out.println("Write something");
}
public void printColor(){
    System.out.println(this.color);
}
public void showtype(){
    System.out.println(this.type);
}
}
class student{
    String name;
    int age;
    public void Information(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

}
public class OOPS {
    public static void main(String[] args) {
        // for pen class
        Pen pen1=new Pen();
        pen1.color="blue";  // It assign the blue color
        pen1.type="gel"; // It assign the type of pen
        pen1.write(); // then write function is called to write something
        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";
        pen1.printColor();
        pen2.printColor();
        pen1.showtype();
        pen2.showtype();
        // for student class
  student s1=new student();
  s1.name="Shubham";
  s1.age=24;
  s1.Information();
    }
}
