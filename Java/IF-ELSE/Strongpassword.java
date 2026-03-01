import java.util.Scanner;
public class Strongpassword{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        if(pass.length()>=8&&
        pass.matches(".*[A-Z].*")&&
        pass.matches(".*[a-z].*")&&
        pass.matches(".*[0-9].*")){
            System.out.println("Strong password");
        }
        else{
            System.out.println("Weak password");
        }
        
    }
}


public class Strongpassword{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        if(pass.length()>=8 &&
        pass.matches(".*[A-Z].*") &&
        pass.matches(".*[a-z].*") &&
        pass.matches(".*[0-9].*")){
            System.out.println("Strong password");
        }
        else{
            System.out.println("Weak password");
        }
    }
}


public class Strongpassword{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        if(pass.length()>=8 &&
        pass.matches(".*[A-Z].*") &&
        pass.matches(".*[a-z].*") &&
        pass.matches(".*[0-9].*")){
            System.out.println("Strong password");
        }
        else{
            System.out.println("Weak password");
        }
    }
}