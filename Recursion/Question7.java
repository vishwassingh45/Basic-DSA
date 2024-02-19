package DSA_with_JAVA.Recursion;

public class Question7 {
    public static int Sum_of_nCubes(int n)
    {
        // Base Case
        if(n==0)
        {
            return 0 ;
        }
        return n*n*n + Sum_of_nCubes(n-1);
    }
    public static void main(String[] args) {
        System.out.println(Sum_of_nCubes(5));
    }
}
