package DSA_with_JAVA.Recursion;

public class Question3 {
    public static void Print_1_to_n(int n)
    {
        if(n==0)
        {
            return;
        }
        Print_1_to_n(n-1);
        System.out.println(n);



    }
    public static void main(String[] args) {
        Print_1_to_n(5);
    }
}
