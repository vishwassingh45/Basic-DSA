package DSA_with_JAVA.Recursion.Array_using_recursion;

public class Question10 {

    // Brute Force
    public static int FirstOccurrence(int []arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }



    // Using recursion
    public static int firstoccurrence(int []arr,int index,int key)
    {

        if(index==arr.length-1)
        {
            return -1;
        }

        if(arr[index]==key)
        {
            return index;
        }
        return firstoccurrence(arr,index+1,key);
    }
    public static void main(String[] args) {
        int []arr={8,3,6,9,5,10,2,5,3};
        System.out.println(firstoccurrence(arr,0,5));
    }
}
