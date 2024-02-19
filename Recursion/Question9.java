package DSA_with_JAVA.Recursion;

public class Question9 {
    public static int power_of_2(int n)
    {
        //Base case
        if(n==1)
        {
            return 2;
        }
        else{
            return 2* power_of_2(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(power_of_2(3));
    }
}
