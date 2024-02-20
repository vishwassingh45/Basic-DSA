package DSA_with_JAVA.Recursion.Array_using_recursion;

public class Question6 {
    public static void Even_number(int []arr,int index)
    {
        // Base case
        if(index>=arr.length)
        {
            return;
        }
        // Processing
        if(arr[index]%2==0)
        {
            System.out.print(" " + arr[index]);
        }
        // recursive relation
        Even_number(arr,index+1);




    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        Even_number(arr,0);
    }
}
