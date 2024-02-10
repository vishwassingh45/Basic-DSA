package DSA_with_JAVA.Binary_Search;

public class Question12 {
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
    public static int Search_in_an_infinite_sorted_Array(int []arr,int target)
    {
        int start=0,end=1;
       while(target>arr[end])
       {
           start=end;
           end*=2;
       }
       return Binary_Search(arr,target,start,end);
    }
    public static void main(String[] args) {
        int []arr={0,1,2,3,4,5,6,7,8,9,10};
        int target=7;
        System.out.println(Search_in_an_infinite_sorted_Array(arr,target));

    }
}
