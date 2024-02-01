package DSA_with_JAVA.BitManipulation;

public class Question14 {
    // B
    public static int Decimal_to_Binary(int number)
    {
        int ans=0,rem=0,step=1;
        while(number>0)
        {
            rem=number%2;
            number=number/2;
            ans=rem*step+ans;
            step*=10;
        }
        return ans;
    }


    public static int Count_1(int N)
    {
        int x=Decimal_to_Binary(N);
        int rem=0;
        int count=0;
        while(x>0)
        {

            rem=x%10;
            if(rem==1)
            {
                count++;
            }
            x=x/10;


        }
        return count;

    }
    public static void main(String[] args) {
       int y=Count_1(8);
        System.out.println(y);
    }
}
