package DSA_with_JAVA.StringQuestiona;

public class Question3 {
    public static boolean CheckLexicographically(String a, String b)
    {
        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<b.length();j++)
            {
                if(a.length()==b.length() && a.charAt(i)==a.charAt(j))
                {
                    return true;

                }

            }
        }
        return false;


    }

    public static void main(String[] args) {
       if(CheckLexicographically("Vishwas","Vishwas"))
       {
           System.out.println("Lexicography");
       }
       else{
           System.out.println("Nope");
       }
    }
}
