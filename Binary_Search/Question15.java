package DSA_with_JAVA.Binary_Search;

public class Question15 {
    public static int Bitonic_array(int []arr)
    {
        int ans=-1;
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
      return -1;
    }
    public static void main(String[] args) {
       int []arr={1,3,8,12,4,2};
       int []arr1={5,10,20,15};
        System.out.println(Bitonic_array(arr1));
    }
}
