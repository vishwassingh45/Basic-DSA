package DSA_with_JAVA.Binary_Search;

public class Question1 {
    public static int First_Occurrence(int []arr,int target)
    {
        int start=0,end=arr.length-1;
        int first=-1;
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]==target)
            {
                first=mid;
                end=mid-1;


            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return first;
    }
    public static int Last_Occurrence(int []arr,int target)
    {
        int start=0,end=arr.length-1;
        int last=-1;
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]==target)
            {
                last=mid;
                start=mid+1;


            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return last;
    }



    public static void main(String[] args) {
        int []arr={5,7,7,8,8,10};
        int target=7;
        System.out.println("First occurrence  of target " + First_Occurrence(arr,target));
        System.out.println("Last occurrence of target " + Last_Occurrence(arr,target));
       int a=First_Occurrence(arr,target);
       int b=Last_Occurrence(arr,target);
        System.out.println((a+(b+a))/2);
    }
}
