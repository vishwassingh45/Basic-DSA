package DSA_with_JAVA.pattern;

public class Question12 {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++) {
           int k=1;
            for (int j = 1; j <= 7; j++)
            {
                if(j>=5-i && j<=3+i)
                {

                    int a=j<4?k++:k--;
                        System.out.print(a);





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
