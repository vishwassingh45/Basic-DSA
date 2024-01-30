package DSA_with_JAVA.pattern;

public class Question20 {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=8;j++)
            {
                if(j>=5-i && j<=9-i)
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
        pattern(4);
    }
}
