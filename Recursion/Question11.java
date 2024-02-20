package DSA_with_JAVA.Recursion;

import java.util.Scanner;

public class Question11 {
    public static int Factorial(int n)
    {
        // Base case
        if(n==0)
        {
            return 1;
        }
        // Recursive relation
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println("Factorial of " + n + " is : " + Factorial(5));
    }
}
