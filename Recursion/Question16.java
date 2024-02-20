package DSA_with_JAVA.Recursion;

public class Question16 {
    public static  void GCD(int a,int b)
    {
       //Base case
        if(b==0)
        {
            System.out.println(a);
            return ;
        }
         // recursive relation
         GCD(b,a%b);
    }
    public static void main(String[] args) {
    GCD(18,48);
    }
}
