package DSA_with_JAVA.Binary_Search;

public class Question13 {
    public static int infinite_binary_Array(int []arr)
    {
        int ans;
        int start=0,end=1;

        while(arr[end]<=arr[start])
        {
            start=end;
            end*=2;

        }
        ans=end;
        return ans;

    }
    public static void main(String[] args) {
       int []arr={0,0,0,0,1,1,1,1,1};

        System.out.println(infinite_binary_Array(arr));
     }
}
