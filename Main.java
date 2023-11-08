import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Bank bank1 = new Bank("Melissa", 900); //the 'new' keyword, lets us know we are creating a new instance of bank
        System.out.println(bank1.getBalance());
        System.out.println(bank1.getBankBalance());

        Bank bank2 = new Bank("Eric", 500);
        System.out.println(bank2.getBalance());
        System.out.println(bank2.getBankBalance());

        Bank bank3 = new Bank("Peter", 1000);
        System.out.println(bank3.getBalance());
        System.out.println(bank3.getBankBalance());


        // System.out.println(bank1.AuthorizedUser);
        System.out.println(bank1.getBalance());
        // System.out.println(bank1.AccountType);

        // bank1.Deposit(500.0);
        // bank1.Deposit(50.0);
        // bank1.Deposit(10.0);
        // double currentBalance;
        // currentBalance = bank1.getBalance();
        // System.out.println(currentBalance);

        // bank1.Withdraw(50.0);
        // currentBalance = bank1.getBalance();
        // System.out.println(currentBalance);

        // Scanner scanner = new Scanner(System.in);
        // scanner.nextLine();

        System.out.println(bank2.AuthorizedUser);

        //How to use a switch
        String name = "Peter";
        switch (name) {
            case "M" :
            System.out.println("name is M");
                break;
                case "Peter":
                System.out.println("Peter is the name");
                break;
            default:
            System.out.println("Name doesn't match");
                break;
        }
        //Switches are like if statements. The above could've been written with an if statement.

        Sqrt();

    }
    public static void Sqrt() {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Enter an integer");
        int userinput = scanner.nextInt();
        System.out.println("Square root is " + Math.sqrt(userinput));
        } catch(InputMismatchException e) {
            System.out.println("Please enter integers");
        }
        scanner.close();
    }
}