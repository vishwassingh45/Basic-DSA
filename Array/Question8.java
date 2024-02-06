package DSA_with_JAVA.Array;

public class Question8 {
    public static int maxi(int []arr)
    {
        int max=Integer.MIN_VALUE;
        for(int elem:arr)
        {
            if(elem>max)
            {
                max=elem;
            }
        }
        return max;
    }
    public static int second_largest_with_distinct(int [] arr)
    {
       int x=maxi(arr);
       int second=Integer.MIN_VALUE;

       for(int j:arr)
       {
           if(j!=x)
           {
               if(j>second)
               {
                   second=j;

               }
           }
       }
       return second;
    }
    public static void main(String[] args) {
        int []arr={12,35,1,10,34,1};
        int x=second_largest_with_distinct(arr);
        System.out.println("second largest : " + x);
    }
}
