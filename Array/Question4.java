package DSA_with_JAVA.Array;

public class Question4 {
    public static void second_largest(int []arr)
    {
        int max=Integer.MIN_VALUE,second_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                second_max=max;
                max=arr[i];
            }
            if(arr[i]!=max && second_max>arr[i])
            {
                second_max=arr[i];
            }
        }
        System.out.println("Second maximum element : " + second_max);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,10};
        second_largest(arr);

    }
}
