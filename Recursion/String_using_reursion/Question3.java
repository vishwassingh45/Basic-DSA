package DSA_with_JAVA.Recursion.String_using_reursion;

import java.util.Scanner;

public class Question3 {
    public static int Count_vowel(String text,int index)
    {
        char []ch=text.toCharArray();

        // Base case
        if(index==-1)
        {
            return 0;
        }
        if(ch[index]=='a' || ch[index]=='e' || ch[index]=='i' || ch[index]=='o' || ch[index]=='u')
        {
            return 1 + Count_vowel(text,index-1);
        }
        return Count_vowel(text,index-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        String text=sc.next();
        System.out.println(Count_vowel(text,text.length()-1));
    }
}
