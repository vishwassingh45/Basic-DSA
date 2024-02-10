package DSA_with_JAVA.Binary_Search;

public class Question9 {
    public static int floor_value(int []arr,int target)
    {
        int ans=-1,start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start + (end-start)/2;

            if(arr[mid]==target)
            {
                return arr[mid];
            }
            else if(arr[mid]<=target)
            { ans=arr[mid];
                start =mid+1;
            }
            else{

                end=mid-1;

            }

        }
        return ans;


    }
    public static void main(String[] args) {
        int []arr={1, 2, 3, 4, 8, 10, 10 , 12 , 29};
         int target=5;
          int x=floor_value(arr,target);
        System.out.println("Floor value of target is  : " + x);
    }
}
