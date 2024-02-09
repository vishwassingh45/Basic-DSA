package DSA_with_JAVA.Binary_Search;

public class Question3 {
    public static int SQRT(int x)
    {
        int start=1,end=x;
        int ans=0;
        if(x<2)
        {
            return x;
        }
        while(start<=end)
        {
            int mid= start + (end-start)/2;

            if(mid==x/mid)
            {
                return mid;
            }
            else if(x/mid>mid)
            {
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=8;
        System.out.println(SQRT(x));
    }
}
