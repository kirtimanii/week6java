package workshopweek8;


/**
 * Write a description of class BankAccount here.
 *
 * K
 * v1.0
 */
public class HospitalTest
{
    public static void main(String[] args)
    {
        Patient p1 = new Patient("Ram", 45, 5, 2500);
        Patient p2 = new Patient("Shyam", 17, 10, 3000);

        
        p1.displayDetails();
        System.out.println("Total Bill: Rs" + p1.calculateTotalBill());
        System.out.println();

        p2.displayDetails();
        System.out.println("Total Bill: Rs." + p2.calculateTotalBill());
    }
}