package DSA_with_JAVA.Recursion;

public class Question1 {
    public static void Print_n_to_1(int n)
    {
        // Base case

        if(n==0)
        {
            return;
        }
        System.out.println(n);
        Print_n_to_1(n-1);
    }
    public static void main(String[] args) {
        Print_n_to_1(5);
    }
}
