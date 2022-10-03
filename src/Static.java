class Student{
    String name;
    static String school;

}
public class Static {
    public static void main(String[] args) {
        Student.school="hdsh";
        Student student1=new Student();
        student1.name="Shubham";
        System.out.println(student1.school);
    }
}

