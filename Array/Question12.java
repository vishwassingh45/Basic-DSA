package DSA_with_JAVA.Array;

import java.util.HashSet;
import java.util.Set;

public class Question12 {
    public static int repeat(int []arr)
    {
        int count=0;
        int start=0,end=arr.length-1;

        while(start<=end)
        {

            if(arr[start]==arr[end] && start<end)
            {
               count++;


            }

            start++;
            end--;



        }
        return count;


    }
    public static void main(String[] args) {
          int []arr={1,5,3,4,3,5,6};
          int x=repeat(arr);
        System.out.println(x);
    }
}
