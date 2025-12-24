package week7;


/**
 * Write a description of class BankAccount here.
 *
 * K
 * v1.0
 */
public class main
{
    public static void main(String[] args)
    {
        //classname s1= new classname(); 
        student s1= new student();
        s1.name="Kritimani";
        s1.collegeID= 10111;
        s1.age = 22;
        
        s1.study();
        
        System.out.println(s1.name);
        System.out.println(s1.collegeID);
        System.out.println(s1.age);
        
        student s2= new student();
        s2.name="Abhisarika";
        s2.collegeID= 20647;
        s2.age = 18;
        
        s2.study();
        
        System.out.println(s2.name);
        System.out.println(s2.collegeID);
        System.out.println(s2.age);
        
        car s3= new car();
        s3.brand="BMW M4";
        s3.color= "Black";
        s3.price = 2500000;
        
        s3.drive();
        
        System.out.println(s3.brand);
        System.out.println(s3.color);
        System.out.println(s3.price);
        
        
    }
}