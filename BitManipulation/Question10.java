package DSA_with_JAVA.BitManipulation;

public class Question10 {
    public static int Reverse_digit(int number)
    {

          int rem=0,ans=0;
        while(number!=0)
        {
            rem=number%10;
            number=number/10;

            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10)
            {
                return 0;
            }
            ans=ans*10+rem;



        }
        return  ans;

    }
    public static void main(String[] args) {
          int x= Reverse_digit(-123);
        System.out.println(x);
    }
}
