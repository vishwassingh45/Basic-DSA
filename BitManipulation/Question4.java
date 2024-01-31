package DSA_with_JAVA.BitManipulation;

public class Question4 {
    public static void Decimal_to_octal(int number)
    {
        int ans=0,step=1;
        while(number>0)
        {
            int rem=number%8;
            number=number/8;
            ans=rem*step+ans;
            step*=10;
        }
        System.out.println("Octal form : " + ans);
    }
    public static void main(String[] args) {
        Decimal_to_octal(35);
    }
}
