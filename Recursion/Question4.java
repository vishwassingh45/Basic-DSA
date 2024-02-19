package DSA_with_JAVA.Recursion;

public class Question4 {
    public static void PrintEven_1_to_n(int n)
    {
        // Base case
        if(n==0)
        {
            return ;
        }
        // recursive relation
        PrintEven_1_to_n(n-1);
        if(n%2==0)
        {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        PrintEven_1_to_n(10);
    }
}
