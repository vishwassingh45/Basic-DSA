package DSA_with_JAVA.Binary_Search;
import java.util.ArrayList;
import java.util.Collections;

public class Question19 {
    public static int Maximum(ArrayList<Integer>list)
    {
        int x=Integer.MIN_VALUE;
        for (Integer integer : list) {
            if (integer > x) {
                x = integer;

            }
        }
        return x;
    }

    public static boolean isvalid(ArrayList<Integer>list,int k,int mid)
    {
        int cowCount=1;
        int lasPos=list.get(0);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>=mid)
            {
                cowCount++;
                if(cowCount==k)
                {
                    return true;
                }
                lasPos=list.get(i);
            }
        }
        return false;

    }
public static int AgressiveCow(ArrayList<Integer>list,int k)
{
    Collections.sort(list);
    int result=-1;
    int start=0,end=Maximum(list);

    while(start<=end)
    {
        int mid = start + (end-start)/2;
        if(isvalid(list,k,mid))
        {
            result=mid;
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return result;
}
    public static void main(String[] args) {
     ArrayList<Integer>list=new ArrayList<>();
     list.add(4); list.add(2); list.add(1); list.add(3); list.add(6);
     int k=2;
        System.out.println(AgressiveCow(list, k));
    }
}
