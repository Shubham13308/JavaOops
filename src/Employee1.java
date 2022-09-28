class Account{
    String Emp;
    int acc_no;
    float amount;
    void insert(String n,int acc,float amt){
        Emp=n;
        acc_no=acc;
        amount=amt;
    }
    void deposit(float amt){
        amount=amount+amt;
        System.out.println("Amount :"+amt);
    }
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("insufficient balance");
        }
        else{
            amount=amount-amt;
            System.out.println("Withdraw amount"+amt);
        }

    }
    void checkbalance(){
        System.out.println("Balance is"+amount);

    }
    void display(){
        System.out.println(acc_no+" "+Emp+" "+amount);
    }

}
public class Employee1 {
    public static void main(String[] args) {
Employee s1=new Employee();
s1.insert(3325,"Shubham",25000);
s1.display();

    }
}
