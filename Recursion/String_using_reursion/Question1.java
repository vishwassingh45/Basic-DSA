package DSA_with_JAVA.Recursion.String_using_reursion;


import java.util.Scanner;

public class Question1 {
    public static void Reverse_String(String text,int start,int end)
    {
        char []ch=text.toCharArray();
        char temp=' ';
        // Base case
        if(start>=end)
        {
            return;
        }
        temp=ch[start];
        ch[start]=ch[end];
        ch[end]=temp;

        // recursive relation
        Reverse_String(text,start+1,end-1);





    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String text=sc.next();
    Reverse_String(text,0,text.length()-1);
        System.out.println(text);

    }
}
