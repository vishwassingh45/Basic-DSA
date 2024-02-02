package DSA_with_JAVA.BitManipulation;

import java.util.Scanner;

public class Question16 {
    public static char a_to_A(char character)
    {
        char ans= (char) (character-'a'+'A');
        return ans;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
         char y= sc.next().charAt(0);

         char z=a_to_A(y);
        System.out.println("Upper case character : " + z);
    }
}
