public class Cal {
    public int monthlyPayment(int s, double r, int t){
        // s*(r*(1+r)^t/(1+r)^t-1)
        return (int)Math.floor(s*((r*Math.pow((1+r),t))/(Math.pow((1+r),t)-1)));
    }

    public int payOut(int mp, int t){
        return  mp*t;
    }
    public int overpayment(int payOut, int s){
        return payOut-s;
    }
}
