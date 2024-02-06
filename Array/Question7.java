package DSA_with_JAVA.Array;

import java.util.ArrayList;
import java.util.Collections;

public class Question7 {
    public static void reverse(ArrayList<Integer>list)
    {
        int start=0,end=list.size()-1;

        while(start<=end)
        {
            Collections.swap(list,start,end);
            start++;
            end--;
        }
    }
    public static void print(ArrayList<Integer>list)
    {
        for(int elem:list)
        {
            System.out.print(" " + elem);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1); list.add(2); list.add(3);
        list.add(4); list.add(5);

        reverse(list);
        print(list);
    }
}
