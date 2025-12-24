package week7;


/**
 * Write a description of class book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class book
{
    String title; // attributes
    String author;
    int price;
    
    public book(String title, String author, int price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void read()
    {
        System.out.println();
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
        System.out.println();
        
    }
}