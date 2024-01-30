package DSA_with_JAVA.pattern;

public class Question19 {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            char a='A';
            int x=1;
            for(int j=1;j<=8;j++)
            {
                if(j>=5-i && j<=4+i)
                {
                    if(j==5)
                    {
                        a='1';

                    }
                    System.out.print(a);
                    a++;



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
