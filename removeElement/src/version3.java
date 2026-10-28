import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class version3 {
    public static void main(String[] args) {

        //int[] nums={1,1,1,2,3,3};
        //int[] nums={1,3};
        //int[] nums={1,1,1,2,2,3};
        //int[] nums={0,0,1,1,1,1,2,3,3};
        int[] nums={-3,-1,0,0,0,3,3};

        System.out.println("solution is "+sol(nums));

        for(int j=0;j< nums.length;j++)
        System.out.print(" "+nums[j]);

    }

    public static int sol(int[] nums) {

        int z=1;

        LinkedHashMap<Integer,Integer> mapObj1=new LinkedHashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++) {
            if(mapObj1.containsKey(nums[i]))
            {
                if (mapObj1.get(nums[i])==2)
                    continue;
                    mapObj1.put(nums[i],(mapObj1.get(nums[i]))+1 );
            }
                        else
                mapObj1.put(nums[i],1);

        }

        int x=0;
        for (Integer v : mapObj1.keySet())
        {
            for(int i=0;i<mapObj1.get(v);i++) {
                nums[x] = v;
                x++;
            }
        }

        mapObj1.entrySet().forEach(System.out::println);

        for(int i=x;i<nums.length;i++)
            nums[i]=0;

        return x;
    }

    public static void swapElementsAtindex(int[] nums,int i,int j)
    {
        int temp=0;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        //System.out.println("swapped index for "+i+" and "+j);
    }
}
