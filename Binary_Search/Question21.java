package DSA_with_JAVA.Binary_Search;

public class Question21 {
    public static boolean isvalid(int [] weights,int days,int mid)
    {
        int  capacitySum=0;
        int  d=1;

        for(int i=0;i<weights.length;i++)
        {
            if(capacitySum + weights[i]<=mid)
            {
                capacitySum+=weights[i];
            }
            else{
                d++;

                if(d>days || weights[i]>mid)
                {
                    return false;
                }
                capacitySum=weights[i];
            }
        }
        return true;
    }


    public  static int shipWithinDays(int[] weights, int days) {
        int sum=0,result=-1;

        for(int elem:weights)
        {
            sum+=elem;
        }

        int start=0,end=sum;

        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(isvalid(weights,days,mid))
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
        int [] weights = {1,2,3,4,5,6,7,8,9,10}; int  days = 5;
        System.out.println(shipWithinDays(weights,days));
    }
}
