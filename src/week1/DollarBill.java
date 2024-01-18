package week1;
/*displays the conversion of $57 into dollarbill form—20’s, 10’s, 5’s, and 1’s. Save the program as Dollars.java. In this program, alter the value of the variable that holds the amount of money.*/
public class DollarBill {
    Float Amount=57f;
    public DollarBill(float amount)
    {
        this.Amount=amount;
    }
    public void calculate(float amount)
    {
        this.Amount=amount;
        float twentyBill=amount/20;
        int twb = (int) twentyBill;
        float TenBill=(amount%20)/10;
        int tb = (int) TenBill;
        float fivebill=((amount%20)%10)/5;
        int fb = (int) fivebill;
        float onebill=(((amount%20)%10)%5)/1;
        int ob = (int) onebill;

        System.out.println( "Number of 20 bills ="+twb);
        System.out.println( "Number of Ten bills ="+tb);
        System.out.println( "Number of five bills ="+fb);
        System.out.println( "Number of one bills ="+ob);
    }

    public static void main(String[] args)
    {
        DollarBill dollarbillObj=new DollarBill(57f);
        dollarbillObj.calculate(57f);

    }

}
