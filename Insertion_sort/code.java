package DSA_with_JAVA.Insertion_sort;

public class code {
    public static void insertion_Sort(int []arr)
    {

        int temp=0;
        for(int i=1;i<arr.length;i++) {
            for (int j = i; j > 0; j--) {


                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                } else {
                    break;
                }
            }
        }
    }

    public static void display(int []arr)
    {
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }
    public static void main(String[] args) {
        int []arr={7,4,2,3,5};
        insertion_Sort(arr);
        display(arr);
    }
}
