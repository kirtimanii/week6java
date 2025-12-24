package week7;


/**
 * Write a description of class BankAccount here.
 *
 * K
 * v1.0
 */
public class Mobile
{
    String brand;
    int price;

    public Mobile(String brand,int price)
    {
        this.brand=brand;
        this.price=price;
    }
    void isAffordable()
    {
        if(price<20000)
        {
           System.out.println();
           System.out.println(brand);
           System.out.println(price);
        }
        System.out.println();
        
    }
}