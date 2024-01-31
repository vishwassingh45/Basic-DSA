package DSA_with_JAVA.BitManipulation;

public class Question5 {
    public static void Octal_to_Decimal(int number)
    {
        int ans=0,rem=0,step=1;

        while(number>0)
        {
            rem=number%10;
            number/=10;
            ans=rem*step+ans;

            step*=10;

        }

        System.out.print("Octal to Decimal : " + ans);
    }
    public static void main(String[] args) {
        Octal_to_Decimal(43);
    }
}
