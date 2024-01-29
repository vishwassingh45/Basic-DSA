package DSA_with_JAVA.pattern;

public class Question13 {
    public static void pattern()
    {
        for(int i=1;i<=4;i++)
        {
            char x='A';
            for(int j=1;j<=7;j++)
            {
                if(j<=5-i || j>=3+i)
                {
                    char y=j<4?x++:x--;
                    System.out.print(y);

                }
                else {
                    System.out.print(" ");
                    if (j == 4) {
                        x--;
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern();
    }
}
