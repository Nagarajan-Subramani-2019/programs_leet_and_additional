import java.util.*;

import static java.lang.Math.max;

public class majorityElement {
    public static void main(String[] args) {

        int[] nums = { 1,2,3,4,5,6,7};
        int k=3;

        int[] nums2=new int[nums.length];

        for (int i = nums.length-1; i >= 0; i--)
            nums2[(i+k)%nums.length]=nums[i];

        nums=nums2;

        System.out.println("");
        for (int j = 0; j < nums.length; j++)
            System.out.print(" " + nums[j]);

    }

}
