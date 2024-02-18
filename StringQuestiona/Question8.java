package DSA_with_JAVA.StringQuestiona;

import java.util.Arrays;

public class Question8 {
    public static void GetByteArray(String text)
    {
       byte []c=text.getBytes();
       String st=new String(c);

        System.out.println(st.toString());
    }
    public static void main(String[] args) {
        GetByteArray("Vishwas");
    }
}
