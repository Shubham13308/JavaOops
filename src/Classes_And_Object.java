class Employee{
    String name;
    int id;
    float salary;
    void insert(int i,String n,float sal){
        name=n;
        id=i;
        salary=sal;
    }
    void display(){
        System.out.println(+id+" "+name+" "+salary);
    }
}
public class Classes_And_Object {
    public static void main(String[] args) {
Employee s1=new Employee();
s1.insert(101,"Shubham",35000);
s1.display();
    }
}
