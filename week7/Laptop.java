package week7;


/**
 * Write a description of class BankAccount here.
 *
 * K
 * v1.0
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