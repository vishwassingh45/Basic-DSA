package DSA_with_JAVA.StringQuestiona;

import java.util.Collections;

public class Question9 {
    public static void ReverseString(String text)
    {
        char [] ch= text.toCharArray();
        char temp= ' ';

        int start=0;
        int end=ch.length-1;

        while (start<=end)
        {
            temp=ch[start];
            ch[start]=ch[end];
            ch[end]= temp;

            start++;
            end--;
        }
        for (char c : ch) {
            System.out.print(" " + c);
        }

    }

    public static void main(String[] args) {
     ReverseString("Vishwas");

    }
}
