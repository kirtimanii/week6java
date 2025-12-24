package workshopweek8;


/**
 * Write a description of class BankAccount here.
 *
 * K
 * v1.0
 */
public class Student
{
    // attributes
    
    private String name;
    private int id;
    private String address;
    private long phoneNum;
    private static String collegeName;
    
    public Student(String name, int id, String address, long phoneNum, String collegeName)
    {
        this.name=name;
        this.id=id;
        this.address=address;
        this.phoneNum=phoneNum;
        Student.collegeName = collegeName;
    }
    
    // setters and getters
    
    public void setName(String name)
    {
        this.name= name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setId(int id)
    {
        this.id= id;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setAddress(String address)
    {
        this.address= address;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setphoneNum(long phoneNum)
    {
        this.phoneNum= phoneNum;
    }
    
    public long getphoneNum()
    {
        return this.phoneNum;
    }
    
    public void setcollegeName(String collegeName)
    {
        this.collegeName= collegeName;
    }
    
    public String getcollegeName()
    {
        return this.collegeName;
    }
    
    void output()
    {
        System.out.println("Students Name : "+ name);
        System.out.println("Students Id : "+ id);
        System.out.println("Students Address : "+ address);
        System.out.println("Students Phone Number : "+ phoneNum);
        System.out.println("Students College Name : "+ collegeName);
        System.out.println();
    }
}