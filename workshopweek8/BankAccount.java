package workshopweek8;


/**
 * Write a description of class BankAccount here.
 *
 * K
 * v1.0
 */
public class BankAccount
{
    private String accountNumber;
    private long balance;
    private String name;
    
    public BankAccount(String accountNumber,long balance, String name)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
    }
    
    public double getBalance() 
    {
        return balance;
    }

    void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
        }
        else
        {
            System.out.println("Invalid");
        }
    }

    boolean withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            return true;          
        }
        return false;             
    }

}