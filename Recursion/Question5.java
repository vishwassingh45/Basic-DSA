package DSA_with_JAVA.Recursion;

public class Question5 {
    public static void Print_10_to_n(int n)
    {
        if(n<10)
        {
            return;
        }
        Print_10_to_n(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Print_10_to_n(15);
    }
}
