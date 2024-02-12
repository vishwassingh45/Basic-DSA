package DSA_with_JAVA.TwoPointer;

public class Question2 {
    public static int[] TwoSum(int []arr,int target)
    {
        int start=0,end=arr.length-1;

        while(start<=end)
        {
            int sum=arr[start] + arr[end];
            if(sum==target)
            {
               return new int[]{start+1,end+1};
            }
            else{
                if(sum>target)
                {
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int []arr={2,7,11,15,27};
        int target=22;
        int []x=TwoSum(arr,target);
        for(int elem:x)
        {
            System.out.print("[ " + elem + " ]");
        }
    }
}
