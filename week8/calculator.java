package week8;


/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    
    // instance method
    
    // void return type and no parameters
    
    public void displayInfo()
    {
        System.out.println("Welcome to The Calculator");
    }
    
    // void return type plus parameterized
    
    // method overloading:
    
    public void add(int a, int b) // formal parameters
    {
        System.out.println("The sum will be : "+ (a+b));
    }
    
    public void add(double a, double b)
    {
        System.out.println("The sum of two double numbers will be : "+ (a+b));
    }
    
    public void add(int a, int b, int c)
    {
       System.out.println("The sum of three numbers will be : "+ (a+b+c)); 
    }
    // return type plus no parameterized
    
    public int getFixedNumber()
    {
        return 10;
    }
    
    // return type plus parameterized
    
    public int multiply(int a, int b)
    {
        return a*b;
    }
    
    // static method
    
    public static int square(int a)
    {
        return a*a;
    }
}