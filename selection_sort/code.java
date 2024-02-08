package DSA_with_JAVA.selection_sort;

public class code {
    public static void selection_sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i,temp=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
    }
    public static void display(int []arr)
    {
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }

    public static void main(String[] args) {
        int []arr={64,25,12,22,11};
         selection_sort(arr);
         display(arr);
    }
}
