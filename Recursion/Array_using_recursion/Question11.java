package DSA_with_JAVA.Recursion.Array_using_recursion;

public class Question11 {
    // Brute Force

    public static int LastOccurrence(int []arr,int key)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    // Using Recursion

    public static int lastoccurrence(int []arr,int index,int key)
    {

        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==key)
        {
            return index;
        }
        return lastoccurrence(arr,arr.length-1,key);
    }
    public static void main(String[] args) {
        int []arr={8,3,6,9,5,10,2,5,3};
        int key=3;
        System.out.println(lastoccurrence(arr,8,key));
    }
}
