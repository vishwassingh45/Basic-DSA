package DSA_with_JAVA.Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question6 {
    public static void move_all_negative_to_end(ArrayList<Integer>arr)
    {
        Collections.sort(arr);
        int start=0,end=arr.size()-1;
        int temp=0;
        while(start<=end)
        {
            if(arr.get(start)>0)
            {
                start++;
            }
            else{
                if(arr.get(end)<0)
                {
                    end--;
                }
                else{
                    Collections.swap(arr,start,end);
                }
            }
        }
    }
    public static void print(ArrayList<Integer>arr)
    {
        for(int element:arr)
        {
            System.out.print(" "+ element);
        }
    }
    public static void main(String[] args) {
       ArrayList<Integer>list=new ArrayList<>();
       list.add(1);
       list.add(-1);
       list.add(3);
       list.add(2);
       list.add(-7);
       list.add(-5);
       list.add(11);
       list.add(16);

       move_all_negative_to_end(list);
       print(list);

    }
}
