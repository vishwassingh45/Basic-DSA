package DSA_with_JAVA.pattern;

public class Question16 {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int x=7-i;
            for(int j=1;j<=7;j++)
            {
                if(j<=8-i)
                {
                    System.out.print(x);
                    x--;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        pattern(7);
    }
}
