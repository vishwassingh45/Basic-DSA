package DSA_with_JAVA.pattern;

public class Question21 {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            char x='1';
            for(int j=1;j<=7;j++)
            {
                if(j>=5-i && j<=3+i)
                {
                    if(j==5)
                    {
                        x='A';
                    }
                    System.out.print(x);
                    x++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
