package DSA_with_JAVA.Binary_Search;

import java.util.ArrayList;

public class Question14 {
    public static int Minimum_difference_in_sorted_Array(ArrayList<Integer>list,int target)
    {
        int start=0,end=list.size()-1;
        int mini=0;
        while(start<=end)
        {
            int mid=start  + (end-start)/2;
            if(list.get(mid)==target)
            {
                return list.get(mid);


            }
            else if(target>list.get(mid))
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
           int a=Math.abs(list.get(start)-target);
           int b=Math.abs(list.get(end)-target);

            mini=Math.min((a),(b));
        }
        return mini;

    }
    public static void main(String[] args) {
     ArrayList<Integer>list=new ArrayList<>();
     list.add(1); list.add(3); list.add(8); list.add(10); list.add(15);

     int target=12;
        System.out.println("Minimum Difference in an soretd array : " + Minimum_difference_in_sorted_Array(list,target));
    }
}
