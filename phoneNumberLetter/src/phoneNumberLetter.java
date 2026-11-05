import javax.print.DocFlavor;
import java.util.*;

public class phoneNumberLetter {
    public static void main(String[] args) {
        System.out.println("Hi");

        String input_num="23";
        System.out.println(letterCombinations(input_num));

    }

    public static List<String> letterCombinations(String digits) {

        Character[][] charMatrix=new Character[digits.length()][4];

        List<String> sol=new ArrayList<>();
        java.util.SortedMap<Integer,List<Character> > mapping=new TreeMap<>();
        mapping.put(2,List.of('a','b','c'));
        mapping.put(3,List.of('d','e','f'));
        mapping.put(4,List.of('g','h','i'));
        mapping.put(5,List.of('j','k','l'));
        mapping.put(6,List.of('m','n','o'));
        mapping.put(7,List.of('p','q','r','s'));
        mapping.put(8,List.of('t','u','v'));
        mapping.put(9,List.of('w','x','y','z'));

        for (int i=0;i< digits.length();i++)
            sol=Cartesian(Character.getNumericValue(digits.charAt(i)),0,sol,mapping);

        //sol=Cartesian(3,0,sol,mapping);

        return sol;
    }


    public static List<String> Cartesian(int a,int b,List<String> sol,java.util.SortedMap<Integer,List<Character> > mapping) {

        List<String> sol2 = new ArrayList<>();
        List<String> base1=new ArrayList<>();
        List<String> base2=new ArrayList<>();

       if(a>0)
           for (Character c : mapping.get(a))
           base1.add(String.valueOf(c));

        if(b>0)
            for (Character c : mapping.get(b))
                base2.add(String.valueOf(c));

       if(b==0)
           for(String sValue : sol)
               base2.add(sValue);

        for(int i=0;i<base1.size();i++) {
            if(base1.get(i) == null)
                continue;
            if(b==0 && sol.size() ==0)
                sol2.add(base1.get(i));
            for (int j=0;j<base2.size();j++)
                sol2.add(base2.get(j)+base1.get(i));
        }
        sol=sol2;

        System.out.println("Fron inter-inter method -->"+sol);
        System.out.println();
        return sol;
    }

}
