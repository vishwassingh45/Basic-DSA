package DSA_with_JAVA.Recursion;

import java.util.Scanner;

public class Question18 {
    public static int Fibonacci_series_of_nth_term(int n)
    {
        // Base case
        if(n==0 || n==1)
        {
            return n;
        }
         // recursive relation
       return Fibonacci_series_of_nth_term(n-1) + Fibonacci_series_of_nth_term(n-2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of number");
        int number =sc.nextInt();
        System.out.println();
        for(int i=0;i<=number;i++)
        {
            System.out.print(" " + Fibonacci_series_of_nth_term(i));
        }
    }
}
