package DSA_with_JAVA.Recursion.String_using_reursion;

import java.util.Scanner;

public class Question2 {
    public static boolean CheckPalindrome(String text,int start,int end){
        char []ch=text.toCharArray();
        // Base case
        if(start>=end)
        {
            return false;
        }
        if(ch[start]==ch[end])
        {
            return true;
        }
        return CheckPalindrome(text,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value : ");
        String text=sc.next();

        System.out.println(CheckPalindrome(text,0,text.length()-1));
    }
}
