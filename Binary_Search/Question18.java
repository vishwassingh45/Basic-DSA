package DSA_with_JAVA.Binary_Search;

public class Question18 {
    public static int TotalSum(int []arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

    public static boolean isvalid(int []arr,int k,int mid)
    {
        int painters=1;
        int sumOfBoards=0;
        for(int i=0;i<arr.length;i++)
        {
            if(sumOfBoards+arr[i]<=mid)
            {
                sumOfBoards+=arr[i];
            }
            else{
                painters++;
                if(painters>k || arr[i]>mid)
                {
                    return false;
                }
                sumOfBoards=arr[i];
            }

        }
        return true;
    }

    public static int Painter_Partition(int []arr,int k)
    {
        int start=0,end=TotalSum(arr);
        int result=-1;
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(isvalid(arr,k,mid))
            {
                result=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
          int []arr={2,1,5,6,2,3};

          int k=2;
        System.out.println(Painter_Partition(arr,k));
    }
}
