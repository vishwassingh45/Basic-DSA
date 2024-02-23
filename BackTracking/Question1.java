package DSA_with_JAVA.BackTracking;

import java.util.Arrays;

public class Question1 {
    public static void InsertElement(int []arr,int index)
    {
        // Base case

        if(arr.length==index)
        {
            return ;
        }

        arr[index]=index+1;


         InsertElement(arr,index+1);
    }
    public static void main(String[] args) {
        int []arr=new int[5];

        InsertElement(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
