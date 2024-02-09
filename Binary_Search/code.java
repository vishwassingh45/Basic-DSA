package DSA_with_JAVA.Binary_Search;

import java.util.Scanner;

public class code {
    public static int Binary_Search(int []arr,int target)
    {
        int start=0,end=arr.length-1;
        while(start<=end)

        {
            int mid= start + (end-start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }
            else if (target>arr[mid]) {
                 start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static int Binary_Search_decreasing_order(int []arr,int target)
    {
        int start=0,end=arr.length-1;
        while(start<=end)

        {
            int mid= start + (end-start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }
            else if (target<arr[mid]) {
                 start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={2,4,5,8,10,12};
        int []arr1={30,28,20,16,4};
        System.out.println("Enter the target");
        int target=sc.nextInt();
//        System.out.println("Element at " + Binary_Search( arr,target) + " index");
        System.out.println("Element at " + Binary_Search_decreasing_order( arr1,target) + " index");
    }
}
