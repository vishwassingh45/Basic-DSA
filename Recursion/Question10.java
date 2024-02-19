package DSA_with_JAVA.Recursion;

public class Question10 {
    public static boolean check(int n)
    {
        if(n<=0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        return (n%2==0) && check(n/2);
    }
    public static void main(String[] args) {
        System.out.println(check(8));
    }
}
