package DSA_with_JAVA.BitManipulation;

public class Question12 {
    public static  boolean Palindrome(int number)
    {
        int reverse=0;
        int obj=number;
        boolean t=true;
        if(number<0 || number%10==0 && number!=0)
        {
            return false;
        }

        while(number!=0)
        {

            reverse=reverse*10 + number%10;
            number=number/10;
        }
        if(obj==reverse)
        {
            return t;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean a= Palindrome(121);
        System.out.println(a);
    }
}
