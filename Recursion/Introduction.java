package DSA_with_JAVA.Recursion;

/*
         RECURSION
      ----------------
      A function which calls itself again and  again until a specific condition met.

    */
public class Introduction {
    public static void Birthday(int n)
    {
       //  Base Case
        if(n==0)
        {
            System.out.println("❤️ Happy Birthday ❤️");
            return ;
        }
           // Recursive Function
            System.out.println(n + " day left");
            Birthday(n-1);

    }
    public static void main(String[] args) {
        Birthday(5);

    }
}
