package DSA_with_JAVA.BitManipulation;

public class Question17 {
    public static int count_digit(int number)
    {
        int count=0,rem=0;

        while(number>0)
        {
            rem=number%10;
            count++;
            number=number/10;
        }
        return count;

    }



    public static void Armstrong_number(int number)
    {
        int x=count_digit(number);
         int rem=0,sum=0;
         int obj=number;
        while(number>0)
        {
            rem=number%10;
            sum= (int) (sum+Math.pow(rem,x));
            number/=10;

        }
        if(obj==sum)
        {
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Not a armstrong number ");
        }
    }
    public static void main(String[] args) {
       Armstrong_number(1634);
    }
}
