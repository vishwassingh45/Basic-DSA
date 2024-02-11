package DSA_with_JAVA.Binary_Search;

public class Question16 {

    public static int Binary_Search(int []arr,int target, int s,int e)
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
    public static int peek(int []arr)
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
    public static int search(int []arr,int target)
    {
        int x=peek(arr);
        if(x>x-1 && x>x+1) {
            return Binary_Search(arr, target, 0, x - 1);
        }
        else
        {
            return Binary_Search(arr,target,x,arr.length-1);
        }


    }


    public static void main(String[] args) {
        int []arr={1,3,8,12,4,2};
        int target=4;
        System.out.println(search(arr,target));
    }
}
