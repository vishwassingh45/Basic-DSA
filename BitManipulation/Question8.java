package DSA_with_JAVA.BitManipulation;

public class Question8 {

    public static int Add_Digit_part(int number)
    {
        int sum=0;
        while(number!=0)
        {
            int rem=number%10;
            sum=sum+rem;
            number=number/10;

        }
        return sum;
    }
    public static void Add_Digit(int number)
    {
        int x=Add_Digit_part(number);
        int rem1=0,sum1=0;

        while(x!=0)
        {
            rem1=x%10;
            sum1=sum1+rem1;
            x=x/10;
        }
        System.out.println("Digit sum : " + sum1);
    }



    // Better Approach

    public static void Add_Digit_optimise(int number)
    {

        while(number>9)
        {
            int rem=0,sum=0;
            while(number!=0)
            {
                rem=number%10;
                sum+=rem;
                number=number/10;

            }
            number=sum;

        }
        System.out.println("Digit sum : " + number);
    }


    public static void main(String[] args) {
      Add_Digit_optimise(249);
    }
}
