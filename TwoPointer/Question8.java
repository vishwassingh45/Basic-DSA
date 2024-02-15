package DSA_with_JAVA.TwoPointer;

public class Question8 {
    // Bruteforce Approach
    // TC :- O(n^4)
    // SC=O(1)

    public static int [] FourSum(int []arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=i+2;k<arr.length;k++)
                {
                    for(int l=i+3;l<arr.length;l++)
                    {
                        if(arr[i]+arr[j]+arr[k]+arr[l]==target)
                        {
                            return new int[]{arr[i],arr[j],arr[k],arr[l]};
                        }
                    }
                }
            }
        }
        return new int[]{};
    }



    // Optimal Approach
    public static int _4Sum(int []arr,int target)
    {
       for(int i=0;i<arr.length-4;i++)
       {
           int ans=target-arr[i];

           int start =i+1,end=arr.length-1;

           while(start<=end)
           {
               int sum=arr[start] +arr[end];
               if(sum==ans)
               {
                   return 1;
               }
               else if(sum>ans)
               {
                   end--;
               }
               else{
                   start++;
               }
           }
       }

        return 0;
    }
    public static void main(String[] args) {
            int []arr={1,5,1,0,6,0};
            int target=7;
//        int []a=FourSum(arr,target);
//        for(int elem:a)
//        {
//            System.out.print(" " + elem);
//        }


        System.out.println(_4Sum(arr,target));



    }
}
