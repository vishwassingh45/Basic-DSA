package DSA_with_JAVA.TwoPointer;

public class Question3 {
    public static int  pair_with_given_difference(int []arr,int target)
    {
        int start=0,end=arr.length-1;

        while(start<=end)
        {
            int difference=arr[end]-arr[start];

            if(difference==target)
            {
                return 1;
            }
            else if(difference>target)
            {
                end--;
            }
            else{
                start++;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int []arr={-10,20};
        int target=30;

        System.out.println(pair_with_given_difference(arr,target));
    }
}
