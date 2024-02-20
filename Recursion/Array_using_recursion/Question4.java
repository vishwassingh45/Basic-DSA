package DSA_with_JAVA.Recursion.Array_using_recursion;

public class Question4 {
    public static int Maximum_value(int []arr,int index)
    {
        // Base case
        if(index==arr.length-1)
        {
            return arr[index];
        }
        return Math.max(arr[index],Maximum_value(arr,index+1));
    }
    public static void main(String[] args) {
        int []arr={2,15,1,3,5};
        System.out.println(Maximum_value(arr,0));

    }
}
