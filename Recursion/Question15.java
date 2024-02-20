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
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
