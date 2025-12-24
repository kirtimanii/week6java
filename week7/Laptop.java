package week7;


/**
 * Write a description of class Laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Laptop
{
    String brand;
    int ram;
    int price;

    public Laptop(String brand, int ram, int price)
    {
        this.brand=brand;
        this.ram=ram;
        this.price=price;
    }
    
    void lap()
    {
        System.out.println();
        System.out.println(brand);
        System.out.println(ram);
        System.out.println(price);
        System.out.println();
        
    }
}