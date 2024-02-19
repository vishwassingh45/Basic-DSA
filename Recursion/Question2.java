package DSA_with_JAVA.Recursion;

public class Question2 {
    public static void PrintEven_n_to_1(int n)
    {
        if(n==0)
        {
            return;
        }
        if(n%2==0)
        {
            System.out.println(n);
        }
        PrintEven_n_to_1(n-1);
    }
    public static void main(String[] args) {
        PrintEven_n_to_1(6);
    }
}
