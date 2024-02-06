package DSA_with_JAVA.Array;

public class Question10 {
    public static void cyclic_rotate(int []arr,int n)
    {
        int ans=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=ans;

    }
    public static void print(int []arr)
    {
        for(int elem:arr)
        {
            System.out.print(" " + elem);
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,114,5};
        cyclic_rotate(arr,5);
        print(arr);
    }
}
