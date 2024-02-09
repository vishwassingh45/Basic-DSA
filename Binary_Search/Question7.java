package DSA_with_JAVA.Binary_Search;

public class Question7 {
    public static int pivot(int []arr)
    {
        int start=0,end=arr.length-1;
        while(start<end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]>=arr[0])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
    public static int Binary_Search(int []arr,int target,int s,int e)
    {
        int start=s,end=e;
        while(start<=end)

        {
            int mid= start + (end-start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static int Search_in_sorted_rotated(int []arr, int target)
    {
       int pivot=pivot(arr);
       if(target>=arr[pivot] && target<=arr.length-1)
       {
           return Binary_Search(arr,target,pivot,arr.length-1);

       }
       else{
           return Binary_Search(arr,target,pivot-1,0);
       }

    }
    public static void main(String[] args) {
        int []arr={1,3};
        int target=1;
        System.out.println("Element at " + Search_in_sorted_rotated(arr,target) + " index");
    }
}
