package workshopweek8;


/**
 * Write a description of class BankAccount here.
 *
 * K
 * v1.0
 */
public class ShoppingApp
{
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart("Book", 250.0, 2);
        cart.displayCart();

        
        cart.setQuantity(3);
        System.out.println("Updated Quantity : " + cart.getQuantity());

        
        double discountedTotal = cart.calculateDiscountedTotal(10);
        
        System.out.println("Price after discount: " + discountedTotal);
    }
}
