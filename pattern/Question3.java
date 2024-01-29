package DSA_with_JAVA.pattern;

public class Question3 {
    public  static void patter(int n)
    {
        for(int i=1;i<=5;i++)
        {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patter(5);
    }
}
