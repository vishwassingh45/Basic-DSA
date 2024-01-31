package DSA_with_JAVA.BitManipulation;

public class Question3 {
    public static void Binary_to_Decimal(int number)
    {
        int rem=0,ans=0,step=1;

        while(number>0)
        {
            rem=number%10;
            number=number/10;
            ans=rem*step+ans;
            step*=2;

        }

        System.out.println("Decimal Form : " + ans);
    }
    public static void main(String[] args) {
        Binary_to_Decimal(1101);
    }
}
