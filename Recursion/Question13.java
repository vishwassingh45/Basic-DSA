package DSA_with_JAVA.Recursion;

public class Question13 {
    public static int Sum_of_Square_of_n_numbers(int n)
    {
        // Base case
        if(n==0)
        {
            return 0;
        }

        // recursive relation
      return n*n + Sum_of_Square_of_n_numbers(n-1);
    }
    public static void main(String[] args) {
        System.out.println(Sum_of_Square_of_n_numbers(5));
    }
}
