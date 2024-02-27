package DSA_with_JAVA;

import java.util.ArrayList;

public class Revision {
    public static boolean isvalid(ArrayList<Integer>boards,int k,int mid)
    {
        int Painters=1;
        int BoardSum=0;

        for(int i=0;i<boards.size();i++)
        {
            if(boards.get(i)+BoardSum<=mid)
            {
                BoardSum+=boards.get(i);
            }
            else{
                Painters++;

                if(Painters>k || boards.get(i)>mid)
                {
                    return false;
                }
                BoardSum=boards.get(i);
            }
        }
        return true;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int sum=0;
        for(int elem:boards)
        {
            sum+=elem;
        }

        int start=0,end=sum;
        int result=-1;

        while(start<=end)
        {
            int mid= start + (end-start)/2;

            if(isvalid(boards,k,mid))
            {
                result=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        ArrayList<Integer>boards=new ArrayList<>();
        boards.add(2);
        boards.add(1);
        boards.add(5);
        boards.add(6);
        boards.add(2);
        boards.add(3);
        int k=2;   // Number of painters.

        System.out.println(findLargestMinDistance(boards,k));
    }
}