package DSA_with_JAVA.Binary_Search;

public class Question17 {

    public static int total_sum(int []pages)
    {
        int sum=0;
        for(int i=0;i<pages.length;i++)
        {
            sum+=pages[i];
        }
        return sum;
    }

    public static boolean isvalid(int []arr,int no_of_pages,int mid, int no_of_students)
    {
        int studentCount=1;
        int pagesum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(pagesum + arr[i] <=mid)
            {
                pagesum+=arr[i];
            }
            else{
                studentCount++;
                if(studentCount>no_of_students || arr[i]>mid)
                {
                    return false;
                }

                pagesum=arr[i];
            }
        }
        return true;
    }
    public static int Allocate_pages(int []pages,int no_of_students)
    {
        int start=0;
        int end=total_sum(pages);
        int result=-1;
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(isvalid(pages,no_of_students,mid,no_of_students)){
                result=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int []pages={12,34,67,90};
        int no_of_students=2;
        System.out.println(Allocate_pages(pages,no_of_students));

    }
}
