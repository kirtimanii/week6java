package week7;


/**
 * Write a description of class Employee here.
 *
 * K
 * v1.0
 */
public class Employee
{
    int id;
    String name;
    int salary;
    
    public Employee(int id, String name, int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    void work()
    {
        System.out.println();
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println();
        
    }
}