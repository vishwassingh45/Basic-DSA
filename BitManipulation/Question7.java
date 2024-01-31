package DSA_with_JAVA.BitManipulation;

public class Question7 {
    public static int octal_to_decimal(int number)
    {
        int ans=0,rem=0,step=1;
        while (number>0)
        {
            rem=number%10;
            number=number/10;

            ans=rem*step+ans;
            step=step*8;
        }
       return ans;
    }
    public static void Octal_to_Binary(int number)
    {
        int x=octal_to_decimal(number);
        int ans1=0,rem1=0,step1=1;

        while(x>0)
        {
            rem1=x%2;
            x=x/2;
            ans1=rem1*step1+ans1;
            step1=step1*10;
        }
        System.out.print("Octal to Binary : " + ans1);


    }
    public static void main(String[] args) {
        Octal_to_Binary(17);

    }
}
