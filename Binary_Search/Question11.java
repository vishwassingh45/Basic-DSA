package DSA_with_JAVA.Binary_Search;

public class Question11 {
    public static char Next_letter(char []arr,char target)
    {
        int start=0,end=arr.length-1;
        char ans='\0';
        while(start<=end)
        {
            int mid=start + (end-start)/2;


             if(arr[mid]<=target)
            {
                start=mid+1;
            }
            else{
                ans=arr[mid];
                end=mid-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        char []arr={'a','c','f','h'};
        char target='f';
        System.out.println(Next_letter(arr,target));
    }
}
