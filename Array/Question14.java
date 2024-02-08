package DSA_with_JAVA.Array;

public class Question14 {
    public static int unique_number(int []arr)
    {
        int ans=0;
        for (int j : arr) {
            ans = ans ^ j;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={2,3,3,1,1,2,6};
        int x=unique_number(arr);
        System.out.println("Unique element is  : " + x);
    }
}
