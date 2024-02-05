package DSA_with_JAVA.Array;

public class Question5 {
    public static void third_smallest(int []arr)
    {
        int min=Integer.MAX_VALUE,second_min=Integer.MAX_VALUE,third_min=Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min) {
                second_min = min;
                min = j;


            }
            if (j != min && j < second_min) {
                third_min = second_min;
                second_min = j;
            }
            if (j != min && j != second_min && j < third_min) {
                third_min = j;
            }


        }
        System.out.println("Second smallest number : " + third_min);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        third_smallest(arr);
    }
}
