package DSA_with_JAVA;

public class Revision {
    public static int Peak_in_Mountain(int []arr)
    {
        int start=0,end=arr.length-1;

        int mid= start + (end-start)/2;
        while(start<end)
        {

            if(arr[mid]<arr[mid+1])
            {

                start=mid+1;
            }
            else{
                end=mid;
            }
            mid= start + (end-start)/2;

        }
        return mid;
    }
    public static void main(String[] args) {
       int []arr={3,4,5,1};
        System.out.println(Peak_in_Mountain(arr));
    }
}