package DSA_with_JAVA.BitManipulation;

public class Question_1 {
    public static void combine_digit(int a,int b,int c)
    {
        int ans=(a*10+b) ;
        int total=(ans*10)+c;
        System.out.println("Combined number is : " + total);

    }
    public static void main(String[] args) {
        combine_digit(2,3,5);
    }
}
