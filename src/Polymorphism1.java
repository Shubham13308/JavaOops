class Add{
    int a;
    int b;
    int c;
    void add1(int a){
        System.out.println(a);
    }
    void add1(int a,int b){
        System.out.println(a+b);
    }
    void add1(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
Add a1=new Add();
a1.add1(3,2);

    }
}
