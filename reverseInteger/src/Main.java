import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("call Process");
        System.out.println(reverse(2147483647));
        System.out.println(reverse(-2147483647));
        System.out.println(reverse(-100));
        System.out.println(reverse(1));
        System.out.println(reverse(12345));
        System.out.println(reverse(-1234567));

        System.out.println(reverse(1563847412));
       // System.out.println(reverse(-2147483651));



        }

    public static int reverse(int a)
        {

            System.out.println();
            Integer aa=new Integer(a);
            int negative_ind=0;

            char[] int_reverse=new char[aa.toString().length()];
            int_reverse=aa.toString().toCharArray();
            System.out.println(int_reverse);

          //  if ( ! validation(int_reverse))
           //     return 0;



            char[] int_reverse_sol=new char[aa.toString().length()];
            int i=0;

            for (int j = int_reverse.length-1; j >=0; j--)
            {

                if(int_reverse[j]=='-')
                {negative_ind=1;
                    continue;}
                int_reverse_sol[i++]=int_reverse[j];

            }

            if ( ! validation(int_reverse_sol))
                return 0;

            String str= new String(int_reverse_sol).replace("\0", "");
            String strs= (negative_ind==1) ? "-"+str : str;
           // System.out.println(strs);

            int aa_sol=Integer.parseInt(strs);
            return aa_sol;

        }
    public static boolean validation(char[] intReverse) {

        String str= new String(intReverse).replace("\0", "");
      //  float aa_sol=Float.parseFloat(str);
      //  float diviso=2147483648.00f;
      //  System.out.println(str+" / 2147483648 doub... "+aa_sol/diviso);
     //   System.out.println(str+" % 2147483648 doub... "+aa_sol%diviso);

        long aa_sol1=Long.parseLong(str);
        long diviso1=2147483648L;
        System.out.println(str+" / 2147483648 long... "+aa_sol1/diviso1);
        System.out.println(str+" % 2147483648 long... "+aa_sol1%diviso1);

if(aa_sol1/diviso1 >=1 && aa_sol1%diviso1 > 1  )
            return false;
        if(aa_sol1/diviso1 >1   )
            return false;
else return true;
    }
}
