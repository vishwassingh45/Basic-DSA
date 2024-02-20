package DSA_with_JAVA.Recursion.Array_using_recursion;

public class Question1 {
    public static void PrintArray(int []arr,int index)
    {
        // Base case
        if(index>=arr.length)
        {
            return;
        }
        System.out.print(" " + arr[index] );
        PrintArray(arr,index+1);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
          PrintArray(arr,0);
    }
}
