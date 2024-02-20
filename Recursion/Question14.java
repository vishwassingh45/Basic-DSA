package DSA_with_JAVA.Recursion;

import java.util.Scanner;

public class Question14 {
    public static boolean Check_prime(int number ,int i)
    {
        // Base case
        if(number%i==0)
        {
            return false;
        }
        if(number==2)
        {
            return true;
        }
        if(i*i>number)
        {
            return true;
        }
        return Check_prime(number,i+1);

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        System.out.println(Check_prime(number,2));
    }
}
