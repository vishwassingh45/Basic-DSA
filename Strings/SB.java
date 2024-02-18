package DSA_with_JAVA.Strings;

public class SB {
    public static void main(String[] args) {
        // Concept of StringBuilder, It is mutable just like array in Java

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch = (char)('a' + i);
           sb.append(ch);
        }
        System.out.println(sb.toString());
        sb.deleteCharAt(1);
        System.out.println(sb.toString());
    }
}
