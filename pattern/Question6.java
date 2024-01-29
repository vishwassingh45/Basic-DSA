package DSA_with_JAVA.pattern;

public class Question6 {
    public static void pattern(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=7;col++)
            {
                if(col>=5-row && col<=3+row)
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
