package DSA_with_JAVA.Binary_Search;

public class Question6 {
    public static int Pivot(int []arr)
    {
        int start=0,end=arr.length-1;

        while(start<end)
        {
            int mid=start  + (end-start)/2;

            if(arr[mid]>=arr[0])
            {
                start=mid+1;
            }
            else{
                end=mid;
            }

        }
        return start;
    }
    public static void main(String[] args) {
        int []arr={3,8,10,17,1};
        System.out.println("Pivot element in an array : " + Pivot(arr));
    }
}
