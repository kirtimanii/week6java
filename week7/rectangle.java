package week7;


/**
 * Write a description of class rectangle here.
 *
 * K
 * v1.0
 */
public class rectangle
{
    int length;
    int breadth;
    
    public rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void math()
    {
        System.out.println();
        System.out.println(length);
        System.out.println(breadth);
        System.out.println();
        
        int area=0;
        area=length*breadth;
        System.out.println(area+ " is the area.");
        System.out.println();
        
    }
}