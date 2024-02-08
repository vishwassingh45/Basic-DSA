package DSA_with_JAVA.Array;

public class Question16 {
    public static int remove_duplicates(int []arr)
    {
        int start=0;
        for(int end=1;end<arr.length;end++)
        {
            if(arr[end]!=arr[start])
            {
                arr[start+1]=arr[end];
                start++;
            }
        }
        return start+1;
    }

    public static void main(String[] args) {
        int []arr={1 ,2 ,2 ,3 ,3, 3, 4, 4, 5, 5 };
        int x=remove_duplicates(arr);
        System.out.println(x);
    }
}
