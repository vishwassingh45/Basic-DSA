package DSA_with_JAVA.Recursion.Array_using_recursion;

public class Question9 {
    // Brute Force
    public static boolean CheckSorted(int []arr)
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


    // Using Recursion

    public static int Checksorted(int []arr,int index)
    {
        if(index==arr.length-1)
        {
            return 1;
        }
        if(arr[index]>arr[index+1])
        {
            return 0;
        }



        return Checksorted(arr,index+1);


    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(Checksorted(arr,0));

    }
}
