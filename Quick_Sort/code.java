package DSA_with_JAVA.Quick_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class code {
    public static int PartionElement(int []arr,int start,int end)
    {
        int Position=start;
        int temp=0;
        for(int i=start;i<=end;i++)
        {
            if(arr[i]<=arr[end])
            {
                temp=arr[i];
                arr[i]=arr[Position];
                arr[Position]=temp;

                Position++;
            }
        }
        return Position-1;
    }
    public static void QuickSort(int []arr, int start, int end)
    {
        // Base case

        if(start>=end)
        {
            return;
        }
        int Pivot = PartionElement(arr,start,end);

        // First part
        QuickSort(arr,start,Pivot-1);

        // Second Part
        QuickSort(arr,Pivot+1,end);

    }
    public static void main(String[] args) {
      int []arr={6,4,2,8,13,7,11,9,3,6};
       QuickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
