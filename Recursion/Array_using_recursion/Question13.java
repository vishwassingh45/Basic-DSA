package DSA_with_JAVA.Recursion.Array_using_recursion;

public class Question13 {
    public static int LinearSearch(int []arr,int index,int key)
    {
        // Base case
        if(index==arr.length-1)
        {
            return -1;
        }
        if(arr[index]==key)
        {
            return index;
        }
        return LinearSearch(arr,index+1,key);
    }
    public static void main(String[] args) {
        int []arr={2,4,5,12,1,3};
        int key=3;
        System.out.println(LinearSearch(arr,0,key));
    }
}
