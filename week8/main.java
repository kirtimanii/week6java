package week8;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        calculator calc = new calculator();
        calc.displayInfo();
        calc.add(10,20);
        int fixedNum = calc.getFixedNumber();
        System.out.println(calc.getFixedNumber());
        System.out.println("My Fixed Number is : "+ fixedNum);
        
        int multi = calc.multiply(10,20);
        System.out.println("The Product is : "+ multi);
        
        // static method invocation or invoking static method
        // using className
        
        calculator.square(10);
        
        student s1 = new student("Kri",101);
        
    }
}