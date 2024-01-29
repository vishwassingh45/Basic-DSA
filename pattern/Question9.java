package DSA_with_JAVA.pattern;

public class Question9 {
    public static void pattern(int n)
    {

        for(int i=1;i<=n;i++)
        {
            int k=1;
            for(int j=1;j<=9;j++)
            {
                if(j>=6-i && j<=4+i && k==1)
                {
                    System.out.print("*");
                    k=0;
                }
                else{
                    System.out.print(" ");
                    k=1;
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       pattern(5);
    }
}
