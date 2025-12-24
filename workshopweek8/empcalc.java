package workshopweek8;


/**
 * Write a description of class BankAccount here.
 *
 * K
 * v1.0
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