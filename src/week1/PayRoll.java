package week1;

public class PayRoll {
    float PayRate;
    float WorkHours;
    public PayRoll(float payrate, float workhours)
    {
        this.PayRate=payrate;
        this.WorkHours=workhours;
    }
    public void calculateNetPay()
    {
        float grossPay=PayRate*WorkHours;
        float tax=grossPay*0.15f;
        float NetPay=grossPay-tax;
        System.out.println("Net Pay is :"+NetPay);
    }

    public static void main(String[] args)
    {
        PayRoll payRollObj=new PayRoll(12.0f,8.5f);
        payRollObj.calculateNetPay();
    }

}
