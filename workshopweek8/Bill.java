package workshopweek8;


/**
 * Write a description of class Bill here.
 *
 * @author (your name)
 * @version (a version number or a date)
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