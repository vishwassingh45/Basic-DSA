package DSA_with_JAVA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     /*
        Array is the collection of similar datatype.
        SYNTAX:- Datatype [] variable_name = new  Datatype[size];
     */
    /* Example :-*/ int [] arr=new int[5];
    /* Example :-*/ int [] arr1={1,2,3,4,5};

    /* Let us deep dive the syntax */

        /*
             int [] arr is a reference variable that refers the declaration of the array and store into the stack.
              =new int[5]; Here, the actual memory(Heap) create and this is called initialisation.
         */

        String [] r=new String[4];
        System.out.println(r[0]);

        /* Take input from an array  */
        int [] numbers=new int[5];

        // Using for loop
        System.out.println("Enter 5 elements : ");
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
        // Using for each loop
        for (int elem : numbers) { // for  every element in array print all elem
            System.out.print(" " +elem); // Here the elem represents the element of the array.
        }

        // toString() Function
        System.out.println(Arrays.toString(numbers));


    }
}
