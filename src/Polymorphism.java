class Students {
    String name;
    int age;

    public void displayInfo(String name) {
        System.out.println(name);
    }

    public void displayInfo(int age) {
        System.out.println(age);
    }

    public void displayInfo(String name, int age) {
        System.out.println(age+" "+name);
    }
    }
class Polymorphism{
    public static void main(String[] args) {
        Students s1=new Students();
        s1.name="Shubham";
        s1.age=24;
        s1.displayInfo(s1.name,s1.age);
    }
}