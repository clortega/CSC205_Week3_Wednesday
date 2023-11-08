public class Main {
    public static void main(String[] args){
        Bank bank1 = new Bank(); //the 'new' keyword, lets us know we are creating a new instance of bank
        bank1.Deposit(500.0f);
        bank1.Deposit(50.0f);
        bank1.Deposit(10.0f);
        float currentBalance;
        currentBalance = bank1.getBalance();
        System.out.println(currentBalance);

        bank1.Withdraw(50.0f);
        currentBalance = bank1.getBalance();
        System.out.println(currentBalance);




    }

}