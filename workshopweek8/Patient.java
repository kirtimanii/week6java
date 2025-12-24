package workshopweek8;


/**
 * Write a description of class BankAccount here.
 *
 * K
 * v1.0
 */
public class Patient
{
    private String patientName;
    private int age;
    private int daysAdmitted;
    private double dailyCharge;
    
    public Patient(String patientName, int age, int daysAdmitted, double dailyCharge) 
    {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted =daysAdmitted;
        this.dailyCharge = dailyCharge; 
    }
    
    void setDaysAdmitted(int daysAdmitted) 
    {
        if (daysAdmitted > 0) {
            this.daysAdmitted = daysAdmitted;
        }
    }
    
    int getDaysAdmitted() {
        return daysAdmitted;
    }

    double calculateTotalBill() 
    {
        double totalBill = daysAdmitted * dailyCharge;

        if (daysAdmitted > 7) 
        {
            totalBill = totalBill - (0.10 * totalBill);
        }

        return totalBill;
    }
    
    void displayDetails() 
    {
        System.out.println("Patient Name : " + patientName);
        System.out.println("Age : " + age);
        System.out.println("Days Admitted : " + daysAdmitted);
        System.out.println("Daily Charge : Rs." + dailyCharge);
    }
    
}