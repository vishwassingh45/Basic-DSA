package DSA_with_JAVA.Recursion;

public class Question8 {
    public static void Table(int n,int i)
    {
        if(i>10)
        {
            return ;
        }
        System.out.println(n*i);
        Table(n,i+1);


    }
    public static void main(String[] args) {
        Table(2, 1);
    }
}
