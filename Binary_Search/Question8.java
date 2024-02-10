package DSA_with_JAVA.Binary_Search;

public class Question8 {
    public static int Pivot(int []arr)
    {
        int start=0,end=arr.length-1;
        while(start<end)
        {
            int mid=start + (end-start)/2;
            if(arr[start]>=arr[0])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }

    public static boolean Binary_Search(int []arr,int start,int end,int target)
    {
        int s=start,e=end;
        while(s<=e)
        {
            int mid=s + (e-s)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            else if(target>arr[mid])
            {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
    public static boolean Search_in_rotated_Sorted_Array2(int[]arr,int target)
    {
        int x=Pivot(arr);

        if(target>=arr[x] && target<=arr[x])
        {
            return Binary_Search(arr,x,arr.length-1,target);
        }
        else{
            return Binary_Search(arr,x-1,0,target);
        }

    }
    public static void main(String[] args) {
            int []arr={7,8,1,2,3,3,3,4,5,6};
            int []arr1={6,10,1,3,5};
            int []arr2={31,44,56,0,10,13};
            int target=47;
        boolean a=Search_in_rotated_Sorted_Array2(arr2,target);
        System.out.println(a);
    }
}
