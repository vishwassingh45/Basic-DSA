package DSA_with_JAVA;



public class Revision {

    public static int Unique(int []arr)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
      int []arr={1,1,3,2,2};
        System.out.println(Unique(arr));
    }
}
