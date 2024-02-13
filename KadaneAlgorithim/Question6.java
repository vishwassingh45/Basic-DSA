package DSA_with_JAVA.KadaneAlgorithim;

public class Question6 {
    public static int MaxmDiff(int []arr)
    {
        int diff=0,max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            diff=arr[i]-diff;
            max=Math.max(diff,max);

            if(diff<0)
            {
                diff=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr={2,3,10,6,4,8,1};
        int []arr1={7,9,5,6,3,2};
        System.out.println(MaxmDiff(arr));
    }
}
