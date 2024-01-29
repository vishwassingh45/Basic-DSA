package DSA_with_JAVA.pattern;

public class Question1 {
    public static void patt(int n) {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" );
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         patt(4);
    }
}

