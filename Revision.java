package DSA_with_JAVA;



public class Revision {

public static void SelectionSort(int []arr)
{
    int temp=0;
    for(int i=0;i<arr.length;i++)
    {
        int min=i;

        for(int j=i;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                min=j;
            }
        }
        temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }

}
public static void Print(int []arr)
{
    for(int elem:arr)
    {
        System.out.print(" "  + elem);
    }
}

    public static void main(String[] args) {
      int []arr={2,6,1,12,15};
      SelectionSort(arr);
      Print(arr);
    }
}
