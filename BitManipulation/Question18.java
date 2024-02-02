package DSA_with_JAVA.BitManipulation;

public class Question18 {


    public static int Trailing_Zero(int N )
    {
        int count=0;

        while(N>=5)
        {
            count+=N/5;
            N/=5;
        }
        return count;


    }
    public static void main(String[] args) {
        int y=Trailing_Zero(30);
        System.out.println("Number of zeros at last : "  + y);
    }
}
