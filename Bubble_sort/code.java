package DSA_with_JAVA.Bubble_sort;

public class code {
    public static void Bubble_sort(int []arr)
    {
        int temp=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
        int []arr={10,1,7,6,14,9};
        Bubble_sort(arr);
        display(arr);
    }
}
