package DSA_with_JAVA.Recursion;

public class Question17 {
    public static int FrogHops(int number)
    {
        // Base case
        if(number<0)
        {
            return 0;
        }
        if(number==1)
        {
            return 1;
        }
        if(number==2)
        {
            return 2;
        }
        if(number==3)
        {
            return 3;
        }

        // recursive case
        return FrogHops(number-1) + FrogHops(number-2) + FrogHops(number-3);
    }
    public static void main(String[] args) {
        System.out.println(FrogHops(4));
    }
}
