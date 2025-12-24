package week7;


/**
 * Write a description of class Result here.
 *
 * K
 * v1.0
 */
public class Result
{
    int eng;
    int math;
    int nep;

    public Result(int eng, int math, int nep)
    {
        this.eng=eng;
        this.math=math;
        this.nep=nep;
    }

    void total()
    {
        int total=eng+math+nep;
        double percent = (total / 500.0) * 100;
        
        System.out.println();
        System.out.println("Total marks obtained : " + total );
        System.out.println("Percent obtained : " + percent + "%" );
        System.out.println();
    }
}