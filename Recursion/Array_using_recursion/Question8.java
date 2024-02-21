package DSA_with_JAVA.Recursion.Array_using_recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question8 {
    public static void reverse_array(int []arr,int start,int end)
    {
        int temp=0;
        if(start>end)
        {

            return;
        }
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

       reverse_array(arr,start+1,end-1);
    }
    public static void main(String[] args) {
       int []arr={1,2,3,4,5};

       reverse_array(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
