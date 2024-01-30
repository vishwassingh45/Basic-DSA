package DSA_with_JAVA.pattern;

public class Question17 {
    public static void pattern(int n)
    {
        // First Part
        for(int i=1;i<=n;i++)
        {
            int x=1;
            for(int j=1;j<=n;j++)
            {
                if(j>=6-i)
                {
                    System.out.print(x);
                    x++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

//         Second Part
        for(int i=4;i>=1;i--)
        {
            int y=1;
            for(int j=1;j<=n;j++)
            {
                if(j>=6-i)
                {
                    System.out.print(y);
                    y++;
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
