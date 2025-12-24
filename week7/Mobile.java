package week7;


/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
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