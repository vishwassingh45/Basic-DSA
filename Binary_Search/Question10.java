package DSA_with_JAVA.Binary_Search;

public class Question10 {
    public static int ceiling(int []arr,int target)
    {
        int ans=-1;
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]==target)
            {
                return arr[mid];
            }
            if(arr[mid]<=target)
            {
                start=mid+1;
            }
            else{
                ans=arr[mid];
                end=mid-1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={3,4,4,7,8,10};
        int target=8;
        System.out.println("Ceiling Value : " + ceiling(arr,target));
    }
}
