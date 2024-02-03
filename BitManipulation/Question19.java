package DSA_with_JAVA.BitManipulation;

public class Question19 {
    public static void Rectangle(int a,int b,int c,int d)
    {
        if((a==b && c==d)||(b==d &&  a==c) || (b==c && a==d))
        {
            System.out.println("This is rectangle");
        }
        else {
            System.out.println("This is not a rectangle");
        }
    }
    public static void main(String[] args) {
        Rectangle(1,1,1,1);
    }
}
