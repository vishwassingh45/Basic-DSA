package DSA_with_JAVA.Array;

public class Question9 {
    public static int missing_number(int []arr,int n)
    {
        int sum=0;
        int ans=0;

        for(int i=0;i<n-1;i++)
        {
            ans+=arr[i];
           sum=n*(n+1)/2;
        }
        return sum-ans;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,5};
        int n=5;
        int x=missing_number(arr,n);
        System.out.println("Missing number : " + x);
    }
}
