package DSA_with_JAVA.Recursion;

public class Question20 {
    public static int Count_Digit(int number)
    {
        // Base case
        int count =0;
        if(number<10)
        {
            return number;
        }
        // recursive relation
        return count+1 + Count_Digit(number/10);

    }
    public static void main(String[] args) {
        System.out.println(Count_Digit(1254589));
    }
}
