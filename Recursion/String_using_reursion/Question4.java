package DSA_with_JAVA.Recursion.String_using_reursion;

import java.util.Scanner;

public class Question4 {
    public static void Lower_to_Upper(String text,int index)
    {  char []ch=text.toCharArray();

        // Base case
        if(index==-1)
        {
            return ;
        }

        ch[index]= (char) ('A' + ch[index] -'a');

         Lower_to_Upper(text,index-1);
    }

    public static void main(String[] args) {
//        System.out.println( 'A' + 'b' - 'a');

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        String text=sc.next();
        Lower_to_Upper(text,text.length()-1);

    }
}
