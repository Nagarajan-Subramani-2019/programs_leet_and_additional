public class removeElement {
    public static void main(String[] args) {
        System.out.println("Ji");

        //int[] nums={3,2,2,3};
        //int val=3;
        //int[] nums={0,1,2,2,3,0,4,2};
        //int val=2;

        int[] nums={3,3};
        int val=5;


        System.out.println("solution is "+sol(nums,val));

        for(int j=0;j< nums.length;j++)
            System.out.print(" "+nums[j]);
    }

    public static int sol(int[] nums, int val) {
        int[] sol=new int[nums.length];

        for(int i=0;i<nums.length;i++)
            if (nums[i] == val)
                for(int z=nums.length-1;z>0;z--) {
                 if(i>z)
                     break;
                     if (nums[z] == val)
                    continue;
                    //swapElementsAtindex(nums,z,i);
                    nums[i]=nums[z];
                    nums[z]=val;
                    break;
                }

        if(nums.length>1)
            for(int j=0;j< nums.length;j++)
            if (nums[j] == val)
                return j;

        if(nums.length==1)
            if (nums[0] == val)
                return 0;
        else
            return 1;


        return nums.length;


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
