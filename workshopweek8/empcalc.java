package workshopweek8;


/**
 * Write a description of class empcalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class empcalc
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee(20000);
        
        System.out.println("Basic Salary : " + emp.getBasicSalary());
        System.out.println("Gross Salary : " + emp.calculateGrossSalary());
    }
}