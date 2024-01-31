package DSA_with_JAVA.BitManipulation;

public class Question6 {

    public static int Binary_to_decimal(int number)
    {
        int ans=0,step=1,rem=0;
        while(number>0)
        {
            rem=number%10;
            number=number/10;
            ans=rem*step+ans;
            step=step*2;

        }
        return ans;
    }

    public static void Binary_to_Octal(int number)
    {
      int x=Binary_to_decimal(number);
      int ans1=0,rem1=0,step1=1;
      while(x>0)
      {
         rem1=x%8;
         x=x/8;
         ans1=rem1*step1+ans1;
         step1=step1*10;

      }
        System.out.println("Binary to Octal : " + ans1);


    }
    public static void main(String[] args) {
        Binary_to_Octal(1111);
    }
}
