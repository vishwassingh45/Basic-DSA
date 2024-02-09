package DSA_with_JAVA.Binary_Search;

public class Question4 {
    public static int cubeRoot(int N) {
        // code here
        long start=1,end=N;
        long ans=-1;
        if(N<2)
        {
            return N;
        }
        while(start<=end)
        {
            long mid= start + (end-start)/2;

            if(mid*mid*mid==N)
            {
                return (int)mid;

            }
            else if(N>mid*mid*mid)
            {
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int)ans;
    }
    public static void main(String[] args) {
     int N=3;

        System.out.println(cubeRoot(N));
    }
}
