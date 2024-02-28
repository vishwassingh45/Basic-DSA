package DSA_with_JAVA.Binary_Search;

public class Question22 {
    public static boolean isvalid(int []arr,int N,int K ,int mid)
    {
        int SplitSum=0;
        int Ksplit=1;
        for(int i=0;i<N;i++)
        {
            if(SplitSum + arr[i]<=mid)
            {
                SplitSum+=arr[i];
            }
            else{
                Ksplit++;

                if(Ksplit>K || arr[i]>mid)
                {
                    return false;
                }
                SplitSum=arr[i];
            }
        }
        return true;
    }
    public static int splitArray(int[] arr , int N, int K) {
        // code here
        int sum=0,result=-1;

        for(int elem:arr)
        {
            sum+=elem;

        }

        int start=0,end=sum;

        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(isvalid(arr,N,K,mid))
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
         int [] arr = {1, 2, 3, 4};
         int N = 4, K = 3;

        System.out.println(splitArray(arr,N,K));
    }
}
