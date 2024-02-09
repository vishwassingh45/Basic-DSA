package DSA_with_JAVA.Binary_Search;

public class Question2 {
    public static int search_insert(int []arr,int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return start;

    }
        public static void main(String[] args) {
         int []arr={1,3,5,6};
         int target=7;
            System.out.println(search_insert(arr,target));
    }
}
