package workshopweek8;


/**
 * Write a description of class StudentTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    public static void main(String[] args)
    {
        Student st1 = new Student("Sandesh",101,"Kathmandu",1747923422,"Islington");
        
        st1.output();
        
        Student st2 = new Student("Abhisarika",102,"Pokhara",1747923342,"Herald");

        st2.output();
        
        Student st3 = new Student("Mukta",103,"Lumbini",1747913442,"Lincoln");
        
        st3.output();
        
        
    }
}