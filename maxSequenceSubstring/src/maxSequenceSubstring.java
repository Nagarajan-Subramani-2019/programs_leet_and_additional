import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class maxSequenceSubstring {
    public static void main(String[] args) {
        System.out.println("hi");

       // String s="ababaccc";
        String s="aba";

        Set<String> sol=new LinkedHashSet<String>();

        char[] charArr=s.toCharArray();
        String compare="";
        String InnerCompare="";
        String InnerCompareCompare="";
        int z=0;
        boolean checkBoolean=false;

        boolean specialIfTillUniqueFound=false;

        for(int x=0;x<charArr.length;x++) {
            if(specialIfTillUniqueFound==false)
                checkBoolean = sol.add(Character.toString(charArr[x]));

            if (checkBoolean==false || specialIfTillUniqueFound==true )
            {
                System.out.println("substring already existed --> " + Character.toString(charArr[x]));

            }

            if( ! checkBoolean && x==charArr.length-1)
            {
                sol.remove(Character.toString(charArr[x-1]));
            sol.add(Character.toString(charArr[x])+Character.toString(charArr[x-1]));
            }

        }

        sol.forEach(System.out::println);
        
                        }



}
