package DSA_with_JAVA.BitManipulation;

public class Question11 {
    public  static  boolean power_of_Two(int number) {

        while(number!=1)
        {
            if(number<1 || number%2==1)
            {
                return  false;
            }

            number/=2;
        }
        return true;
    }
    public static void main(String[] args) {
       boolean a= power_of_Two(31);
        System.out.println(a);

    }
}
