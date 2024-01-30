package DSA_with_JAVA.BitManipulation;

public class Question_2 {
    public static void Decimal_to_Binary(int number)
    {
        int ans=0,step=1;
        while(number>0)
        {
           int rem=number%2;
            number=number/2;
            ans=rem*step+ans;
            step=step*10;

        }
        System.out.println("Decimal to Binary form: " + ans);
    }
    public static void main(String[] args) {
        Decimal_to_Binary(35);
    }
}
