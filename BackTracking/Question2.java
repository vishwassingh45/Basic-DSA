package DSA_with_JAVA.BackTracking;
public class Question2 {

    public static void SubSequence(String text,int index,String ans)
    {
        // Base case

        if(index==text.length())
        {
            if (ans.isEmpty())
            {
                System.out.print("{ Null } ");
            }
            else {


                System.out.print(" " + " { " + ans + " } ");

            }
            return;
        }


        // No choice
        SubSequence(text,index+1,ans);

        // Yes choice

        SubSequence(text,index+1,ans+text.charAt(index));
    }
    public static void main(String[] args) {
     String text="abc";
     String ans="";
     SubSequence(text,0,ans);
     }
   }
