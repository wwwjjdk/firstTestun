import org.junit.Assert;
import org.junit.Test;

public class FirstTest {
    @Test
    public void testMonthlyPaymentCalculation(){
       Cal cal = new Cal();
       /*
       int x =(int) Math.floor(Math.random()*10_000);
       double y = Math.random();
       int z = (int) Math.floor(Math.random()*24);
        */
        int s = 10_000;
        double r = 0.5;
        int t = 24;
        int expected = 5000;
        int result = cal.monthlyPayment(s,r,t);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void testTotalPayout(){
        Cal cal = new Cal();

        int monthlyPayment = 5000;
        int t = 24;

        int result =cal.payOut(monthlyPayment,t);
        int expected = 120_000;
        Assert.assertEquals(expected,result);
    }
    @Test
    public void testOverpayment(){
        int payOut = 120_000;
        int s = 10_000;

        int expected = 110_000;
        int result = new Cal().overpayment(payOut,s);

        Assert.assertEquals(expected,result);
    }
}
