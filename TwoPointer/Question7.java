package DSA_with_JAVA.TwoPointer;

public class Question7 {
    public static int [] Tagret_subarray(int []arr,int key)
    {
        int start=0,end=arr.length-1;

        while(start<=end)
        {
            if(arr[start] + arr[end]==key)
            {
                return new int[]{start+1,end+1};
            }
            else if(arr[start] + arr[end]>key)
            {
                end--;
            }
            else{
                start ++;
            }
        }
        return new int []{};
    }
    public static void main(String[] args) {
        int []arr={2,4,7,11,14,18};
        int target=25;

        int []x=Tagret_subarray(arr,target);
        for(int elem:x)
        {
            System.out.print(" " + elem);
        }
    }
}
