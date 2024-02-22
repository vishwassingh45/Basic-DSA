package DSA_with_JAVA.Merge_Sort;

import java.util.ArrayList;

public class code {
    public static void MergeElement(int []arr,int start,int mid,int end)
    {
        int []dummy=new int[end-start+1];
        int left=start,right=mid+1;
        int index=0;

       while(left<=mid && right<=end)
       {
           if(arr[left]<=arr[right])
           {
               dummy[index]=arr[left];
               left++;
               index++;
           }
           else{
               dummy[index]=arr[right];
               right++;
               index++;
           }
       }

       // Copy the rest element in left part
       while(left<=mid)
       {
           dummy[index]=arr[left];
           left++;
           index++;
       }

       // Copy the rest element in right part
       while(right<=end)
       {
           dummy[index]=arr[right];
           right++;
           index++;
       }

       // Finally add the temporary element into the real array
        index=0;
        while(start<=end)
        {
            arr[start]=dummy[index];
            start++;
            index++;
        }

    }
    public static void MergeSort(int []arr,int start,int end)
    {
        // Base case
        if(start==end)
        {
            return;
        }
        // First Part Divide the array
        int mid= start + (end-start)/2;
        // Left Part
        MergeSort(arr,start,mid);
        // Right Part
        MergeSort(arr,mid+1,end);

        // Merge the element
       MergeElement(arr,start,mid,end);
    }
    public static void main(String[] args) {
        int []arr={6,4,7,2,9,8,3,5};
        MergeSort(arr,0,arr.length-1);

        for(int elem:arr)
        {
            System.out.print(" "  + elem);
        }
    }
}
