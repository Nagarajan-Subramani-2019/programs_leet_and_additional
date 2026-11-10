public class DivideOPerationUsingSum {
    public static void main(String[] args) {
        System.out.println("a");

        System.out.println(" "+divide(-2147483647,-1));
    }

    public static int divide(int dividend, int divisor)  {

        int i=0;

        int  dividend_absInt=Math.abs(dividend);
        dividend_absInt=dividend;
        int  divisor_absInt=Math.abs(divisor);
        divisor_absInt=divisor;
        do {
            if(dividend_absInt>=divisor_absInt)
            {dividend_absInt=dividend_absInt-divisor_absInt;
                i++;
            }
        }while(dividend_absInt>=divisor_absInt);

        if(dividend==0 || divisor==0)
            return 0;

        if(dividend <0)
            i=-(i);

        if(divisor <0)
            i=-(i);


        return i;

    }
}
