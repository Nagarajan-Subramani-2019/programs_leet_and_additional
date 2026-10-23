public class mergeArray {
    public static void main(String[] args) {
        System.out.println("Hi");
        ////int[] a={1,2,3,0,0,0};
        //int[] b={2,5,6};
        //merge2(a,3,b,3);

       // int[] a={0};
       // int[] b={1};
       // merge2(a,0,b,1);

        int[] a={2,0};
        int[] b={1};
        merge2(a,1,b,1);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {

        int z = m+n-1;

        int a=0;
        int b=0;

        if(m==0)
                for (int j = 0; j <n ; j++)
                    nums1[j]=nums2[j];

        if(m==1 && n==1) {
            a = nums1[0];
            b = nums2[0];
            if (java.lang.Math.max(a, b) == b )
                {
                    nums1[0]=b;
                    nums1[1]=a;
            }
            else
            {
                nums1[0]=a;
                nums1[1]=b;
            }
        }

        if (m>1)
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                a = nums1[i];
                b = nums2[j];
                System.out.println(a + "--->" + b);

                if (java.lang.Math.max(a, b) == b || b == a) {
                    nums2[j] = 0;
                    nums1[z] = b;
                    z--;
                }

                if (java.lang.Math.max(a, b) == a || b == a) {
                    if(i>0)nums1[i] = 0;
                    nums1[z] = a;
                    n=j+1;
                    z--;
                    break;
                }
            }

        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int z = m;

        for (int i = m - 1; i >= 0; i--)
            for (int j = n - 1; j >= 0; j--) {
                System.out.println(nums1[i] + "--->" + nums2[j]);


                if (java.lang.Math.max(nums1[i], nums2[j]) == nums1[i]) {
                    nums1[z] = nums1[i];
                    z--;
                    break;
                }

                if (java.lang.Math.max(nums1[i], nums2[j]) == nums2[j]) {
                    nums1[z] = nums2[j];
                    z--;
                    break;

                }
            }
    }

}
