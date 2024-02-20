package DSA_with_JAVA.Recursion.Array_using_recursion;

public class Question5 {
    public static int Product_of_all_element(int []arr,int index)
    {
        // Base case
        if(index>=arr.length)
        {
            return 1;
        }
        // recursive relation
        return arr[index]*Product_of_all_element(arr,index+1);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(Product_of_all_element(arr,0));
    }
}
