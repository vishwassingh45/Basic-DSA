package DSA_with_JAVA.Binary_Search;

public class Question20 {

    public static boolean isvalid(int []arr,int n,int k,long mid )
    {
        long Painters=1;
        long BoardSum=0;

        for(int i=0;i<n;i++)
        {
            if(BoardSum+arr[i]<=mid)
            {
                BoardSum+=arr[i];
            }
            else{
                Painters++;
                if(Painters>k || arr[i]>mid)
                {
                    return false;
                }
                BoardSum=arr[i];
            }
        }
        return true;
    }
    static long minTime(int[] arr,int n,int k){
        //code here
        long sum=0;
        long result=-1;


        for(int elem:arr)
        {
            sum+=elem;
        }
        long start=0,end=sum;

        while(start<=end)
        {
            long mid= start + (end-start)/2;
            if(isvalid(arr,n,k,mid))
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
        int []arr = {5,10,30,20,15};
        int []arr1={10,20,30,40};

        System.out.println(minTime(arr1,4,2));

    }
}
