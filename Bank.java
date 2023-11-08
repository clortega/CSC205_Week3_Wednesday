/**
 * Bank
 */
enum AccountTypeEnum {SAVINGS, CHECKING}

public class Bank {
    final String RoutingNumber = "123456";

    //This balance will track the overall balance of the bank
    private static double BankBalance;

    private double Balance; 
    AccountTypeEnum AccountType;
    String AuthorizedUser;

public Bank() {
    AccountType = AccountTypeEnum.CHECKING;
    AuthorizedUser= "";
}

public Bank(String incAuthorizedUser) {
    this.AuthorizedUser = incAuthorizedUser;
    AccountType = AccountTypeEnum.CHECKING;}

public Bank(String incAuthorizedUser, double balance) {
    this.AuthorizedUser = incAuthorizedUser;
    AccountType = AccountTypeEnum.CHECKING;
    BankBalance += balance;
    Balance = balance;
}

public double getBalance() 
{
    return Balance;
}
public double getBankBalance() {
    return BankBalance;
}
public double Deposit(double amount)
{
    BankBalance += amount;
    return Balance;
}
public double Withdraw(double amount)
{   double updatedBalance = Balance - amount;
    double rtnBalance = 0;
    if(updatedBalance >= 0){
        Balance -= amount;
        BankBalance -= amount;
        rtnBalance = updatedBalance;

    } else {
        double zeroBalance = 0;
        Balance = zeroBalance;
        BankBalance -=amount;
        rtnBalance = zeroBalance;
    }
    BankBalance -= amount;

    //System.out.println(zeroBalance);
    return rtnBalance;
}
    public static double ConvertUSDtoAUD(double usd) {
        return usd * 1.56;

    }
}