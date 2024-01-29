package DSA_with_JAVA.pattern;

public class Question8 {
    public static void pattern(int n)
    {
        // For first part
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=7;col++)
            {
                if(col>=row && col<=8-row)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }

        // For second part

        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= 7; j++)
            {
                if(j>=5-i && j<=3+i)
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
