package DSA_with_JAVA.Array;

import java.util.ArrayList;


public class Question13 {
    public static int first_repeating_element(ArrayList<Integer>list)
    {
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    return i+1;

                }
            }
        }
        return 0;



    }
    public static void main(String[] args) {
     ArrayList<Integer>list=new ArrayList<>();
     list.add(1);
     list.add(5);
     list.add(3);
     list.add(4);
     list.add(3);
     list.add(5);
     list.add(6);
     int x=first_repeating_element(list);
        System.out.println(x);
    }
}
