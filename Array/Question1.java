package DSA_with_JAVA.Array;

import java.util.Scanner;

public class Question1 {
    public static int find_index(int []arr,int target)
    {
        for(int i=0;i<arr.length;i++ )
        {
            if(arr[i]==target)
            {
                return  i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();

        int [] arr=new int[size];
        System.out.println("Enter the element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=5;

        int a=find_index(arr,target);
        System.out.println("Index of the element  : " + a);
    }
}
