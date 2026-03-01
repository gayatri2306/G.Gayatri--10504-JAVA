import java.util.Scanner;
public class ATM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        double amount = sc.nextDouble();
        if(amount<=balance){
            System.out.println("Transaction successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}


public class ATM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        double amount = sc.nextDouble();
        if(amount<=balance){
            System.out.println("Transaction successful");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}


public class ATM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        int amount = sc.nextDouble();
        if(amount<=balance){
            System.out.println("Transaction successful");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}