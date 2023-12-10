import java.util.*;
class Bankacc{
    double amount;
    Bankacc(double a){
        amount=a;
    }
}
public class BankAccount {

    public static void withdraw(Bankacc obj,double a) {
        if(obj.amount-a<0) {
            System.out.println("Insufficient bank balance for this amount to withdraw.");
            return;
        }
        obj.amount-=a;
        System.out.println("Transaction completed.");
    }
    public static void deposit(Bankacc obj,double a) {
        obj.amount+=a;
        System.out.println("Transaction completed.");
    }
    public static void checkBalance(Bankacc obj) {
        System.out.println("Bank balance: "+obj.amount);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter current bank balance:");
        double amt=sc.nextDouble();
        Bankacc obj1=new Bankacc(amt);
        char ch;
        do {
            System.out.print("Press 1 to withdraw."
                    +"\nPress 2 to deposit"
                    +"\nPress 3 to check balance."
                    +"\nEnter your choice:");
            int p=sc.nextInt();
            switch(p) {
                case 1:
                    System.out.print("Enter amount to withdraw:");
                    double a=sc.nextDouble();
                    withdraw(obj1,a);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit:");
                    a=sc.nextDouble();
                    deposit(obj1,a);
                    break;
                case 3:
                    checkBalance(obj1);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Do you want to continue(y/n): ");
            ch=sc.next().charAt(0);
        }while(ch!='n');
    }

}
