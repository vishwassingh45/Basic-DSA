package DSA_with_JAVA.pattern;

public class Question5 {
    public static void pattern(int n)
    {
        for(int row=1;row<=2*n;row++)
        {
            int formula=row>n?2*n-row-1:row;
            for(int col=1;col<=formula;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        pattern(5);
    }
}
