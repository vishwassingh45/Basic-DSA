package DSA_with_JAVA.BitManipulation;

public class Question15 {
    public static int Convert_Decimal_Binary(int number)
    {
        int rem=0,ans=0,step=1;
        while(number>0)
        {
            rem=number%2;
            number=number/2;
            ans=rem*step+ans;
            step*=10;
        }
        return  ans;

    }
    public static   boolean check_even_odd(int number)
    {
        int x=Convert_Decimal_Binary(number);
        int rem=0;

        while(x>0)
        {
            rem=x%10;
            if(rem==1)
            {
                return false;

            }
            break;


        }
        return true;



    }
    public static void main(String[] args) {
      boolean a=check_even_odd(4);
        System.out.println(a);
    }
}
