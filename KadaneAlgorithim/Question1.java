package DSA_with_JAVA.KadaneAlgorithim;

public class Question1 {
    public static void prefixSum(int[]arr)
    {
        int []x=new int[arr.length];

        x[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {

            x[i] = x[i - 1] + arr[i];
        }
        System.out.print("Prefix sum : ");
        for (int i : x) {


            System.out.print(" " + i);
        }
    }
    public static void main(String[] args) {
        int []arr={6,4,5,-3,2,8};
        prefixSum(arr);
    }
}
