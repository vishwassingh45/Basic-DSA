package DSA_with_JAVA.String_theory;

public class Performance {
    public static void main(String[] args) {
        // This is not much optimise why because it creates n objects for n iteration.
        String series =" ";

        for(int i=0;i<26;i++)
        {
            char ch = (char)('a' + i);
//            System.out.println(ch);
            series+=ch;
        }
        System.out.print(" "  + series);
    }
}
