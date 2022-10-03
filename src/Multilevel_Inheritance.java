class Shape{
    public void Display(){
        System.out.println("This is shape");
    }
}
class Rectangle extends shape{
    public void area(){
        System.out.println("This is rectangle");
    }
}
class Maths extends Rectangle{
    public void m(){
        System.out.println("This is maths class");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
Maths m1=new Maths();
m1.display();
m1.area();
m1.m();
    }
}
