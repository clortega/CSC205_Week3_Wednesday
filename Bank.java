/**
 * Bank
 */
enum AccountType {SAVINGS, CHECKING}

public class Bank {

private float Balance;     
    
public float getBalance() 
{
    return Balance;
}

public float Deposit(float deposit)
{
    Balance += deposit;
    return Balance;
}
public float Withdraw(float withdraw)
{
    Balance -= withdraw;
    return Balance;
}


}