package DSA_with_JAVA.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question2 {
    public static void A_to_z(char []arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        char [] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                     'o','p','q','r','s','t','u','v','w','x','y','z'};
        A_to_z(arr);
    }
}
