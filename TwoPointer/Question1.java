package DSA_with_JAVA.TwoPointer;

import java.util.ArrayList;
import java.util.Collections;

public class Question1 {
    public static void Arrange_0_and_1(ArrayList<Integer>list)
    {
        int start=0,end=list.size()-1;

        while(start<=end)
        {
            if(list.get(start)==0)
            {
                start++;
            }
            else{
                if(list.get(end)==1)
                {
                    end--;
                }
                else{
                    Collections.swap(list,start,end);
                }
            }
        }
    }
    public static void display(ArrayList<Integer>list)
    {
        for(int elem:list)
        {
            System.out.print(" " + elem);
        }
    }
    public static void main(String[] args) {
         ArrayList<Integer>list=new ArrayList<>();
         list.add(1);
         list.add(0);
         list.add(1);
         list.add(0);
         list.add(1);
         list.add(0);
         Arrange_0_and_1(list);
         display(list);
    }
}
