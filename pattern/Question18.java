package DSA_with_JAVA.pattern;

public class Question18 {
    public static void pattern(int n)
    {
        // First Part
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=9;j++)
            {
                if(j<=6-i || j>=4+i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        // Second part
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=9;j++)
            {
                if(j<=6-i || j>=4+i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
