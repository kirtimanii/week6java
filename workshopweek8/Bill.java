package workshopweek8;


/**
 * Write a description of class BankAccount here.
 *
 * K
 * v1.0
 */
public class Bill
{
    public static void main(String[] args)
    {
        ElectricityBill bill = new ElectricityBill("Abhisarika", 150);

        System.out.println("Consumer Name : Kirtimani");
        System.out.println("Units Consumed : " + bill.getUnitsConsumed());
        System.out.println("Total Bill Amount : Rs." + bill.calculateBill());
    }
}