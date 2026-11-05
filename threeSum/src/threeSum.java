import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class threeSum {
    public static void main(String[] args) {
        System.out.println("hi");

        int[] arr={-1,0,1,2,-1,-4};

        System.out.println(solution(arr));
    }

    public static List<List<Integer>> solution(int[] arr) {

        List<List<Integer>> fSolution=new ArrayList< List<Integer> >();
        Set<List<Integer>> seen = new HashSet<>();


        for(int i=0;i<arr.length;i++)
            for(int k=i+1;k<arr.length;k++)
                for(int l=k+1;l<arr.length;l++) {
                    if ((arr[i] + arr[k] + arr[l]) == 0) {
                        int x = arr[i], y = arr[k], z = arr[l];
                        if (x > y) { int t = x; x = y; y = t; }
                        if (x > z) { int t = x; x = z; z = t; }
                        if (y > z) { int t = y; y = z; z = t; }

                        List<Integer> tri = List.of(x, y, z);   // immutable but fine — we only read/hash it
                        if (seen.add(tri)) fSolution.add(tri);

                    }

                }
        return fSolution;


    }
}


//List<Integer> tri = List.of(x, y, z);
//if (seen.add(tri)) {          // add() returns false if already present
//        fSolution.add(tri);
//}