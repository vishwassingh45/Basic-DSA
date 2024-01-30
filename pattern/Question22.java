package DSA_with_JAVA.pattern;

public class Question22 {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int x=1;
            for(int j=1;j<=6;j++) {
                if (j <= i) {

                    System.out.print(x);
                    x=1-x;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(6);
    }
}
