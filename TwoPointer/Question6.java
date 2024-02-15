package DSA_with_JAVA.TwoPointer;

public class Question6 {
    // Brute Force Approach
    public static boolean  ThreeSum(int []arr,int target)
    {

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                for(int k=i+2;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target)
                    {
                        return true;
                    }
                }
            }
        }
        return false;

    }


    // Optimal Approach
   public static int Threesum(int []arr,int target)
   {
       for(int i=0;i<arr.length-2;i++)
       {
           int ans=target-arr[i];

           int start=i+1,end=arr.length-1;

           while(start<=end)
           {
               if(arr[start] + arr[end]==ans)
               {
                   return 1;
               }
               else if(arr[start] + arr[end]>ans)
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
       int []arr={1,4,45,6,10,18};
       int []arr1={1,2,4,3,6};
       int []arr3={1,4,6,8,10,45};
       int target=10;
       int key=24;
        System.out.println(Threesum(arr3,key));
    }
}
