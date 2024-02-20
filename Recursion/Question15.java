package DSA_with_JAVA.Recursion;

public class Question15 {
    public static int climbStairs(int n) {
        // Base case
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }

        // recursive relation
        return climbStairs(n-1) + climbStairs(n-2);
    }


    // Using For Loop
    public static void climbStairs2(int n) {
       int st1=1;
       int st2=2;
       int st3=0;
       for(int i=0;i<n;i++)
       {
            st3=st1+st2;
           st1=st2;
           st2=st3;
       }
        System.out.println(st3);
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        climbStairs(5);
    }
}
