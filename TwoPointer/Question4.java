package DSA_with_JAVA.TwoPointer;

public class Question4 {
    public static boolean isProduct(int[] arr, int n, int x) {
        // code here
        int start = 0, end = n - 1;

        while (start <= end) {
            int product = arr[start] * arr[end];

            if (product == x) {
                return true;
            } else if (product < x) {
                start++;
            } else {
                end--;
            }

        }
        return false;
    }

    public static void main(String[] args){
        int []arr={10,20,9,40};
        int n=arr.length;
        int x=400;
        System.out.println(isProduct(arr,n,x));
    }
}
