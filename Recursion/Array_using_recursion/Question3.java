package DSA_with_JAVA.Recursion.Array_using_recursion;

public class Question3 {
    public static int Minimum_value(int []arr,int index)
    {
        // Base case
        if(index==arr.length-1)
        {
            return arr[index];
        }


        return Math.min(arr[index],Minimum_value(arr,index+1));
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(Minimum_value(arr,0));
    }
}
