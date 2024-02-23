package DSA_with_JAVA.Recursion.Array_using_recursion;

public class Question12 {
    public static int BinarySearch(int []arr,int start,int end,int key)
    {
        int mid= start + (end-start)/2;
        if(start>end)
        {
            return -1;

        }
        if(arr[mid]==key)
        {
            return mid;
        } else if (key>arr[mid]) {
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        return BinarySearch(arr,start,end,key);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(BinarySearch(arr,0,arr.length-1,3));
    }
}
