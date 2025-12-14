
/**
 * Mini Book Corner
 *
 * K
 * v1.0
 */
public class scenario6
{
    public static void main(String[] args) 
    {
        String[] categories = {"Fiction", "Nepali"};

        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        titles[0][0] = "Asahamati";
        prices[0][0] = 750.0;
        
        titles[1][0] = "Muna Madan";
        prices[1][0] = 500.0;

        for (int i = 0; i < categories.length; i++) 
        {
            System.out.println("Category: " + categories[i]);
            System.out.println("Title: " + titles[i][0]);
            System.out.printf("Price: %.2f\n\n", prices[i][0]); // %.2f here is used to show the last two digit of the output.
        }
    }
}