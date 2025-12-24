package week7;


/**
 * Write a description of class workshop7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop7
{
    //instance variable
    String name;
    int id;
    
    //constructor
    public workshop7(String name, int id)
    {
        this.name=name;
        this.id=id;
    }
    
    public static void main(String[] args)
    {
        workshop7 s1= new workshop7("Sandesh",101);
        workshop7 s2= new workshop7("Sagar",102);
    }
}