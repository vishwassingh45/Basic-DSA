package DSA_with_JAVA.BitManipulation;

public class Question9 {
    public static void LeapYear(int  year)
    {
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("Year is Leap year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
    public static void main(String[] args) {
        LeapYear(4);
    }
}
