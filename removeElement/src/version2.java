public class version2 {
    public static void main(String[] args) {
        System.out.println("Ji");

        //int[] nums={3,2,2,3};
        //int val=3;
        //int[] nums={0,1,2,2,3,0,4,2};
        //int val=2;

        int[] nums={1,1,2};
        //int[] nums={1,2};
        //int[] nums={1,2};
        //int[] nums={0,0,1,1,1,2,2,3,3,4};

        System.out.println("solution is "+sol(nums));

        for(int j=0;j< nums.length;j++)
            System.out.print(" "+nums[j]);
    }

    public static int sol(int[] nums) {

        int z=1;

        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1])
                continue;
            nums[z]=nums[i];
            z++;
        }
if(nums.length==2 && nums[0]!=nums[1])
return 2;

return z;


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
