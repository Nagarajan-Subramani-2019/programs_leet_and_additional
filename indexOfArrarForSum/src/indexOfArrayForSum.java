import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class indexOfArrayForSum {

    public static void main(String[] args) {
        System.out.println("hello");

        //int[] a={2,7,11,15};
        //int[] a={3,2,4};
        //int[] a={3,3};
        //a = {2,7,11,15};

        int[] a={-1,-2,-3,-4,-5};

        int[] sum=new int[2];
        sum=twoSum(a,-8);
        System.out.println(sum[0]+" "+sum[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] b= {-1,-1};
        boolean result=false;

        for(int i=0;i<nums.length;i++)
        {
           if (result)
           break;

           //if(nums[i]>target)
            //    continue;
            for(int j=1+i;j<nums.length;j++)
            {
                //if(nums[j]>target)
                //    continue;
                if(nums[j]+nums[i]==target)
                {
                    b[0]=java.lang.Math.min(i,j);
                    b[1]=java.lang.Math.max(i,j);
                    result=true;
                    break;
                }
            }
        }
        return b;
    }
}



//      LEET Solution:
//      =================
//      class Solution {
//          public int[] twoSum(int[] nums, int target) {
//              Map<Integer, Integer> hash = new HashMap<>();
//              hash.put(nums[0], 0);
//              int remainder;
//              for (int i = 1; i < nums.length; i++){
//                  if (hash.containsKey(target - nums[i])){
//                      return new int[] {hash.get(target - nums[i]), i};
//                  }
//                  else{
//                      hash.put(nums[i], i);
//                  }
//              }
//              return new int[] {0,0};
//          }
//      }