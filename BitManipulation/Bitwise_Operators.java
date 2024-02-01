package DSA_with_JAVA.BitManipulation;

/*
  Binary AND &
  Binary Or |
  Binary XOR ^
  Binary One's Complement ~
  Binary Left Shift <<
  Binary Right Shift >>
 */
public class Bitwise_Operators {
    public static void Binary_AND(int a,int b)
    {
        System.out.println("AND Operator " + (a&b));

    }

    public static void Binary_OR(int a ,int b)
    {
        System.out.println("Binary OR : " + (a|b));
    }
    public static void Binary_XOR(int a ,int b)
    {
        System.out.println("Binary XOR : " + (a^b));
    }
    public static void Binary_OneComplement(int a)
    {
        System.out.println("One's Complement : " + (~a));
    }

    public static void Binary_LeftShift(int a)
    {
        System.out.println("Left Shift" + (a<<2));
    }
    public static void Binary_RightShift(int a)
    {
        System.out.println("Right Shift" + (a>>2));
    }

    public static void main(String[] args) {
      Binary_AND(5,6);
      Binary_OR(5,6);
      Binary_XOR(5,6);
      Binary_OneComplement(0);
      Binary_LeftShift(5);
      Binary_RightShift(6);

    }
}
