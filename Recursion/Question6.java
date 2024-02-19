package DSA_with_JAVA.Recursion;

public class Question6 {
    public  static int Sum_of_1_to_n(int n)
    {

        // Base case

        if(n==0)
        {
            return 0;
        }

        // Recursive relation
       return  n+Sum_of_1_to_n(n-1);

    }
    public static void main(String[] args) {
        System.out.println(Sum_of_1_to_n(5));
    }
}
