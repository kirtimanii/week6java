package workshopweek8;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    private String consumerName;
    private int unitsConsumed;
    
    public ElectricityBill(String consumerName, int unitsConsumed) 
    {
        this.consumerName= consumerName;
        this.unitsConsumed= unitsConsumed;
    }
    
    void setUnitsConsumed(int unitsConsumed) 
    {
        this.unitsConsumed = unitsConsumed;
    }

    int getUnitsConsumed() 
    {
        return unitsConsumed;
    }

    double calculateBill() 
    {
        double bill;

        if (unitsConsumed <= 100) 
        {
            bill = unitsConsumed * 5;
        } 
        else 
        {
            bill = (100 * 5) + ((unitsConsumed - 100) * 8);
        }

        return bill;
    }
    
}