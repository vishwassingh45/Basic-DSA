package DSA_with_JAVA.BitManipulation;

public class Question13 {
    public static int Convert_Binary(int number)
    {
        int ans=0,step=1;
        while(number>0)
        {
            int rem=number%2;
             number=number/2;
            ans=rem*step+ans;
            step*=10;
        }
        return ans;
    }

    public static void Complement(int number)
    {
        int x=Convert_Binary(number);
        int ans1=0, rem1=0, step=1;

        while(x>0)
        {
            rem1=x%10;
            rem1=rem1^1;
            x=x/10;
            ans1=rem1*step+ans1;
            step*=2;
        }
        System.out.println(ans1);
    }

    public static void main(String[] args) {
         Complement(5);
    }
}
