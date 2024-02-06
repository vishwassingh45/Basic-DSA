package DSA_with_JAVA.Array;

public class Question11 {
    public static int count(int[] arr, int n, int x) {
        // code here
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int []arr={1,1,2,2,2,2,3};
        int x=2;
        int n=arr.length;
       int y= count(arr,n,x);
        System.out.println("Number of occurrence : " + y) ;


    }
}
