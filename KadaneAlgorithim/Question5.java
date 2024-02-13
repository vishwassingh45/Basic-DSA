package DSA_with_JAVA.KadaneAlgorithim;

import java.util.ArrayList;


public class Question5 {
    public static int KadaneAlgo(ArrayList<Integer>list)
    {
        int sum=0,maxi=Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++)
        {
            sum=sum+list.get(i);
            maxi=Math.max(maxi,sum);
            if(sum<0)
            {
                sum=0;
            }

        }
        return maxi;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
       list.add(-2);
       list.add(1);
       list.add(-3);
       list.add(4);
       list.add(-1);
       list.add(2);
       list.add(1);
       list.add(-5);
       list.add(4);

        System.out.println("Maximum sum of sub array : "  + KadaneAlgo(list));
    }
}
