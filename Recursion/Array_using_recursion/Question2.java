package DSA_with_JAVA.Recursion.Array_using_recursion;

public class Question2 {
    public static int Sum_of_element(int []arr,int index)
    {
        int sum=0;
        // Base case
        if(index>=arr.length)
        {
            return 0;
        }
        // recursive relation
        return arr[index] + Sum_of_element(arr,index+1);

    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(Sum_of_element(arr,0));
    }
}
