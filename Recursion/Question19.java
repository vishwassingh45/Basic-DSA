package DSA_with_JAVA.Recursion;

import java.util.Scanner;

public class Question19 {
    public static int DigitSum(int number)
    {
        // Base case
        if(number<10)
        {
         return number;
        }



        return number%10 + DigitSum(number/10);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();

        System.out.println(DigitSum(number));
    }
}
