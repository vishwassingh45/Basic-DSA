package DSA_with_JAVA.TwoPointer;

public class Question5 {
    public static int removeDuplicates(int []arr)
    {
        int start=0;
        for(int end=1;end<arr.length;end++)
        {
            if(arr[start]!=arr[end])
            {
                arr[start+1]=arr[end];
                start++;

            }
        }
        return start+1;
    }
    public static void main(String[] args) {
         int []arr={1,1,2,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}
