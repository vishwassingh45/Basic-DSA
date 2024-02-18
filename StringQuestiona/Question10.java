package DSA_with_JAVA.StringQuestiona;

import java.util.Scanner;

public class Question10 {
    public static boolean Palindrome(String text)
    {
        char [] ch= text.toCharArray();

        for(int i=0;i<ch.length/2;i++)
        {
            if(ch[i]==ch[ch.length-i-1]) {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String x=sc.next();
        if(Palindrome(x))
        {
            System.out.println("Palindrome");


        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
