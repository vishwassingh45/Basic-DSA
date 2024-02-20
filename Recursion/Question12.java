package DSA_with_JAVA.Recursion;

public class Question12 {
    public static int Fibonacci(int n)
    {
        // Base case
        if(n ==0 || n ==1)
        {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);





    }
    public static void main(String[] args) {
        System.out.println(Fibonacci(6));
    }
}
