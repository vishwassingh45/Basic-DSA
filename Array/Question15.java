package DSA_with_JAVA.Array;

public class Question15 {
    public static boolean check_if_soretd(int []arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
            {

            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr={1,2,2,3,3,4};
        int []arr1={1,2,1,3,4};
        boolean x=check_if_soretd(arr1);
        System.out.println(x);
    }
}
