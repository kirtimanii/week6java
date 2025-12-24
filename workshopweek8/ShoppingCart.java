package workshopweek8;


/**
 * Write a description of class ShoppingCart here.
 *
 * K
 * v1.0
 */

public class ShoppingCart 
{
    private String itemName;
    private double itemPrice;
    private int quantity;
    
    public ShoppingCart(String itemName, double itemPrice, int quantity) 
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }
    
    public int getQuantity() 
    {
        return quantity;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    public double calculateTotal() 
    {
        return itemPrice * quantity;
    }
    
    public double calculateDiscountedTotal(double discountPercent) 
    {
        double total = calculateTotal();
        double discountAmount = total * discountPercent / 100;
        return total - discountAmount;
    }

    void displayCart() 
    {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotal());
    }
}
