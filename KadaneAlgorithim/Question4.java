package DSA_with_JAVA.KadaneAlgorithim;

public class Question4 {
    // Brute Force Approach
    public static int TotalSum(int []arr)
    {
        int sum=0;
        for(int elem:arr)
        {
            sum+=elem;
        }
        return sum;
    }
    public static boolean EqualSum(int []arr)
    {
        int sum=TotalSum(arr);
        int check=0;
        for(int i=0;i<arr.length-1;i++)
        {
            check=check+arr[i];
            int ans= sum-check;
            if(ans==check)
            {
                return true;
            }


        }
        return false;

    }

    public static void main(String[] args){
        int []arr={3,4,-2,5,8,20,-10,8};

        System.out.println(EqualSum(arr));

    }
}
