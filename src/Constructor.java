class student1{
    String name;
    int age;
    public void Output(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
 /*   student1(String name,int age){
     //   System.out.println("Constructor is called"); //Non-parameterrized Constructor
        this.name=name;
        this.age=age;

    }*/
    student1(student1 s2){
        this.name=s2.name;
        this.age=s2.age;


    }
    student1(){

    }

}
class Constructor{
    public static void main(String[] args) {
        student1 s1=new student1(/*"Shubham",23*/); // parameterized Construcor
    //    s1.Output();
        s1.name="Shubham";
        s1.age=24;
student1 s2=new student1(s1);   // copy construcor
s1.Output();
        //s1.name="Shubham";
        //s1.age=8;

    }
}