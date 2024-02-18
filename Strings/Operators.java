package DSA_with_JAVA.Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        // Note:- + operator only used for primitive.
        System.out.println('a' + 'b'); // Why because the ascii value of a=97 + b=98
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1); // Integer will be converted to integer that will call toString() = "a" + "1"
        System.out.println("a" + new ArrayList<>());





    }
}
