package DSA_with_JAVA.pattern;

public class Question23 {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=7;j++)
            {
                if((i==1 || i==7 || j==1 || j==7) || (i>=3 &&i<=5 && j>=3 && j<=5))
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
        pattern(7);
    }
}
