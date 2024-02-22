package DSA_with_JAVA.Merge_Sort;

import java.util.Arrays;

public class DecreasingOrder {
    public static void MergeElement(int []arr,int start,int mid,int end)
    {
        int []dummy=new int[end-start+1];
        int left=start,right=mid+1;
        int index=0;

        while(left<=mid && right<=end)
        {
            if(arr[left]>=arr[right])
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
        // Insert remaining element in left part
        while(left<=mid)
        {
            dummy[index]=arr[left];
            left++;
            index++;
        }

       // Insert remaining element in left part
        while(right<=end)
        {
            dummy[index]=arr[right];
            right++;
            index++;
        }

        // Insert dummy array into the original array
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
        int mid= start + (end-start)/2;

        // Base case
        if(start==end)
        {
            return;
        }

        // First part
        MergeSort(arr,start,mid);
        // Second Part
        MergeSort(arr,mid+1,end);

        // Merge the left and right part elements.
        MergeElement(arr,start,mid,end);
    }
    public static void main(String[] args) {
        int []arr={5,2,3,1};
        MergeSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
