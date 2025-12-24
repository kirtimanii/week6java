package workshopweek8;


/**
 * Write a description of class atm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class atm
{
    public static void main(String[] args)
    {
        BankAccount acc = new BankAccount("ACC123",5000,"Kirtimani");

        acc.deposit(2000);
        System.out.println("Balance after deposit: " + acc.getBalance());

        if (acc.withdraw(3000)) 
        {
            System.out.println("Withdrawal successful");
        } 
        else 
        {
            System.out.println("Insufficient balance");
        }

        System.out.println("Final Balance: " + acc.getBalance());
    }

}